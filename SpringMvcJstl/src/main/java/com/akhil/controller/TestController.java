package com.akhil.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/home")
	public String homePage(Map<String, Object> model) {
		
		model.put("message", "Welcome to Book Center");
		return "home"; 
	}
	
	@RequestMapping("/response")
	public String responsePage(Map<String, Object> model) {
		String[] books= {"Java", "Spring", "Hibernate"};
		model.put("books", books);
		return "response";
	}
}
