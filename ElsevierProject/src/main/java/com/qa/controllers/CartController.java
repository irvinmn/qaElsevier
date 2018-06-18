package com.qa.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
@SessionAttributes(names={"book_counts"})
@Controller
public class CartController {

	@RequestMapping("/updatePrice")
	public ModelAndView bookDetails(@RequestParam("price") double price,@RequestParam("quantity") int quantity)
	{
		double totalPrice = price * quantity;
		
		System.out.println("Total price is "+price);
		ModelAndView modelAndView = new ModelAndView("return_price","total_price",totalPrice);
		
		return modelAndView;
		
	}
	
	
	
	@RequestMapping("/checkout")
	public ModelAndView checkoutForm(@ModelAttribute("book_counts") Map<Integer,Integer> bookCounts,@RequestParam("order_total") double orderTotal)
	{
		
		ModelAndView modelAndView = new ModelAndView("checkout","order_total",orderTotal);
		modelAndView.addObject("book_counts", bookCounts);
		return modelAndView;
		
	}
	
	
	
	
	
}
