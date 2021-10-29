package com.example.demo.entities;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	public void testConnection() {
	
	System.out.println(url + " " + username + " " + password);

	}
	
	
	

}
