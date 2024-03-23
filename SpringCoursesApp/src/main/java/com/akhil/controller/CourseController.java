package com.akhil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akhil.pojo.Course;

@Controller
@RequestMapping("/Course")
public class CourseController {
	@GetMapping("/courseinfo")
	public String courseInfo(Model model) {
		Course course=new Course(1,"Spring",5999,"Good Book");
		
		model.addAttribute("cId", course.getCourseId());
		model.addAttribute("cName", course.getCourseName());
		model.addAttribute("cPrice", course.getCoursePrice());
		
		return "course";
	}
	
	@GetMapping("/coursedetails")
	public String courseDetails(Model model) {
		Course course=new Course(2,"Hibernate",600,"Good Course");
		
		model.addAttribute("course", course);
		
		return "coursedetails";
	}
}
