package com.qa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qa.models.Address;
import com.qa.models.Customer;
import com.qa.services.AddressService;

@Controller
public class AddressBookController {

	@Autowired
	private AddressService addressService;
	
	
	@RequestMapping("/updateAddress")
	public ModelAndView updateAddress(@ModelAttribute("logged_in_customer") Customer loggedInCustomer, @ModelAttribute("Address") Address address)
	{
		
		ModelAndView modelAndView  = null;
		
		Address billingAddress = null;
		Address shippingAddress = null;
		System.out.println("Before update ");

		System.out.println("ID "+loggedInCustomer.getCustomerId());
		System.out.println("Name"+loggedInCustomer.getFirstName());
		System.out.println("Email"+loggedInCustomer.getEmail());
		
		
		Address bAddress = addressService.findAddressByType(loggedInCustomer.getCustomerId(), "billing");
		
		Address sAddress = addressService.findAddressByType(loggedInCustomer.getCustomerId(), "shipping");
		
		if(bAddress!=null || sAddress!=null)
		{
		
		        int recordsUpdated = addressService.updateBillingAddress(address.getAddressLine1(),
				address.getAddressLine2(), 
				address.getCity(), 
				address.getPostcode(),
				address.getState(),
				address.getCountry(), 
				address.getPhoneNumber(), 
				loggedInCustomer.getCustomerId(), 
				address.getAddressType());
		
		if(recordsUpdated>0)
		{
			billingAddress  = addressService.findAddressByType(loggedInCustomer.getCustomerId(),"billing");
			shippingAddress  = addressService.findAddressByType(loggedInCustomer.getCustomerId(),"shipping");
			
			System.out.println("After update ");
			modelAndView = new ModelAndView("address_book","billing_address",billingAddress);
			modelAndView.addObject("shipping_address", shippingAddress);
		}
		else
		{
			modelAndView = new ModelAndView("address_book","billing_address",billingAddress);
			modelAndView.addObject("shipping_address", shippingAddress);
			
		}
		
		}
		else
		{
			Address savedAddress = addressService.saveAddress(address);
			modelAndView = new ModelAndView("address_book","billing_address",savedAddress);
			
		}
		return modelAndView;
	}
	
}
