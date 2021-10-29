package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Employee;

@RestController

public class ControllerEmployee {
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@GetMapping("/hello")
	public String hello() {
		
		
		try {
			
			Connection connection = 
					DriverManager.getConnection(url,username, password);
			System.out.println("Connection successfull");
			
		} 
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
		
		
		
		return "hello";
	
	
	}
	
		
		
	
	

	
	

}
