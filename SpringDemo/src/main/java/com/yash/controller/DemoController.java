package com.yash.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
	@RequestMapping("/greet")
	public String greet()
	{
		return "Welcome to Spring Rest Programming...";		
	}
	
}
