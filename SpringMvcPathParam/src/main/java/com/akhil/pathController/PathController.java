package com.akhil.pathController;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.websocket.server.PathParam;

@Controller
public class PathController {
	
	
	//localhost:8080/message/someName/someCourse
	@GetMapping("/message/{name}/{course}")
	public String messageWithData(@PathVariable("name") String name,@PathVariable("course") String course,Map<String, Object> model) {
		String msg="Hello "+name+", Hope your enjoying the course "+course;
		model.put("message", msg);
		return "index";
	}
}
