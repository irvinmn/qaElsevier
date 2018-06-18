package com.qa.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.qa.models.Shipping;

@SessionAttributes(names={"book_counts"})
@Controller
public class CheckoutController {

	@RequestMapping("/checkoutProcess")
	public ModelAndView checkoutProcess(@ModelAttribute("Shipping") Shipping shipping,@ModelAttribute("book_counts") Map<Integer,Integer> bookCounts,@RequestParam("order_total") double orderTotal)
	{
		System.out.println("First name "+shipping.getFirstName());
		ModelAndView modelAndView = new ModelAndView("payment_form","order_total",orderTotal);
		modelAndView.addObject("shipping_address", shipping);
		modelAndView.addObject("order_total", orderTotal);
		modelAndView.addObject("book_counts", bookCounts);
	    return modelAndView;
	}
	@RequestMapping("/loginThroughCheckout")
	public ModelAndView loginThroughCheckout(@ModelAttribute("book_counts") Map<Integer,Integer> bookCounts,@RequestParam("order_total") double orderTotal)
	{
		
		ModelAndView modelAndView = new ModelAndView("login_through_checkout","order_total",orderTotal);
		
		modelAndView.addObject("order_total", orderTotal);
		modelAndView.addObject("book_counts", bookCounts);
	    return modelAndView;
	}
	
	
	
	
	
	
}
