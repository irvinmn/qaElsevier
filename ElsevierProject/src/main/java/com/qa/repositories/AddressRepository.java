package com.qa.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.qa.models.Address;

public interface AddressRepository extends CrudRepository<Address,Integer>
{
	@Modifying
	@Transactional
	@Query("UPDATE Address a set a.addressLine1 = :addressLine1,a.addressLine2 = :addressLine2,a.city = :city,a.postcode = :postcode,a.state= :state,a.country = :country,a.phoneNumber = :phoneNumber WHERE a.customerId = :customerId and a.addressType = :addressType")
	public int updateBillingAddress(@Param("addressLine1") String addressLine1,
			@Param("addressLine2") String addressLine2,
			@Param("city") String city,
			@Param("postcode") String postcode,
			@Param("state") String state,
			@Param("country") String country,
			@Param("phoneNumber") String phoneNumber,
			@Param("customerId") int customerId,
			@Param("addressType") String addressType
			);
	
	@Query("SELECT a from Address a WHERE a.customerId = :customerId and a.addressType = :addressType")
	public Address findAddressByType(@Param("customerId") int customerId,@Param("addressType") String addressType);
}
