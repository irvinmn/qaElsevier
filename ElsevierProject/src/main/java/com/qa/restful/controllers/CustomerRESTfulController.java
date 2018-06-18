package com.qa.restful.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.qa.models.Book;
import com.qa.models.Customer;
import com.qa.services.BookService;
import com.qa.services.CustomerService;

@RestController
@SessionAttributes(names={"books","cart_items","logged_in_customer","Address"})
public class CustomerRESTfulController {

	@Autowired
	BookService bookService;
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/loadAllBooks")
	public Iterable<Book> indexPage(HttpServletRequest request)
	{
		
		ArrayList<Book> cartItems = null;
		
		HttpSession session = request.getSession();
		
		Object items = session.getAttribute("cart_items");
		
		if(items!=null)
		{
			cartItems = (ArrayList<Book>) items;
		}else
		{
			cartItems = new ArrayList<Book>();
		}
		
	
		Iterable<Book> books = bookService.findAllBooks();
		
		ModelAndView modelAndView = new ModelAndView("index","books",books);
		
		modelAndView.addObject("cart_items",cartItems);
		return books;
		
	}

	
	@RequestMapping("/addCustomer")
	public Customer registerProcess(@ModelAttribute("Customer") Customer customer)
	{
		
		System.out.println("Customer Firstname is "+customer.getFirstName());
	
		System.out.println("Customer Password is "+customer.getPassword());
		
		Customer c = customerService.saveCustomer(customer);
	  	
		return c;
	}
	
	@RequestMapping("/loginCustomer")
	public Customer loginProcess(@RequestParam("email") String email,
										@RequestParam("password") String password)
	{
		
		
		System.out.println("Email is "+email);
		
		
		System.out.println("Password is "+password);
		
		
		Customer c = customerService.loginProcess(email, password);
	  
		
		return c;
	}
	
	
	
	
}
