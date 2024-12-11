package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class democontroller {

	@Autowired
	studentservice ss;
	
	@RequestMapping("/")
	public String disp()
	{
		
		return "register";
	}
	
	@PostMapping("/sun")
	public String one(@ModelAttribute("s1") student s1)
	{
		ss.savedata(s1);
		return "login";
	}
	
	@RequestMapping("/hello")
	public String two()
	{
		return "login";
	}
	
}
