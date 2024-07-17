package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/home")
	public String m1()
	{
		return "home page...";
	}
	
	@GetMapping("/about")
	public String m2()
	{
		return "about page...";
	}
	
}
