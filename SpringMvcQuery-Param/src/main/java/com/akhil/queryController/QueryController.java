package com.akhil.queryController;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController {
	
	
	//localhost:8080/message?name=someName&course=someCourse
	@GetMapping("/message")
	public String messageWithData(String name,@RequestParam("course") String c,Map<String, Object> model) {
		String msg="Hello "+name+", Hope your enjoying the course "+c;
		model.put("message", msg);
		return "index";
	}//Here we are not using @RequestParam to name because of the same key name as the variable.
}
