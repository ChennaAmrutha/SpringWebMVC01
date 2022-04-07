package io.amrutha.WebMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import io.amrutha.model.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView getBookInfo() {
		ModelAndView mav = new ModelAndView();
		Book bookObj =  new Book("1","javaInDepth","5000");
		mav.addObject("book",bookObj);
		mav.setViewName("bookView");
		return mav;
	}
}
