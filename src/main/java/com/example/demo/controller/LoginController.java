package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
	
	
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		
		System.out.println("tharun123");
		return "fancy-login";
	}
	
	@GetMapping("/access-denied")
	public String accessDenied() {
		
		
		return "access-denied";
	}
	
	
	

}
