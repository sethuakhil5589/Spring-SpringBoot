package com.akhil.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.akhil.model.Implementers;

@Controller
public class FormBindingController {
	
	@GetMapping("/register")
	public String registering(@ModelAttribute("impl") Implementers impl) {
		System.out.println(impl);
		return "register";
	}
	
	@PostMapping("/register")
	public String registeringProcess(Map<String, Object>model,@ModelAttribute("impl") Implementers impl) {
		System.out.println(impl);
		model.put("impl", impl);
		return "result";
	}
}
