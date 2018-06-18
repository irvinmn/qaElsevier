package com.qa.restful.controllers;




import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;


@RestController
@SessionAttributes(names={"books","cart_items","book_counts","filtered_books"})
public class BookRESTfulController {

	
}
