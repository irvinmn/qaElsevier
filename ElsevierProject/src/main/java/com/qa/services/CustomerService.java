package com.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.qa.models.Customer;
import com.qa.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public Customer saveCustomer(Customer customer)
	{
		
		return customerRepository.save(customer);
	}
	
	public Customer loginProcess(String email,String password){
	
		return customerRepository.loginProcess(email, password);
	}
	
	
	public int updateCustomer(String firstName,
			String lastName,
			String email,
			int customerId){
		
		
		return customerRepository.updateCustomer(firstName, lastName, email, customerId);
	}
	
	
	public Customer findCustomerById(int customerId)
	{
		
		return customerRepository.findOne(customerId);
	}
	
	


}
