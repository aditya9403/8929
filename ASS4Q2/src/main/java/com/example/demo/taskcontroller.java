package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class taskcontroller {

	@Autowired
	taskservice ts;
	
	@RequestMapping("/")
	public String one() {
		return "index";
	}
	
	@PostMapping("/sun")
	public String three(@ModelAttribute ("t1")task t1)
	{
		ts.savedata(t1);
		return "welcome";
	}
	
	@RequestMapping("/sun")
	public String four()
	{
		return "welcome";
	}
}
