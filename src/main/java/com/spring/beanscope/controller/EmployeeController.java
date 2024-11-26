package com.spring.beanscope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.beanscope.entity.User;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value ="/api")
@Scope("session")
public class EmployeeController 
{
	@Autowired
	User user;
	
	
	
	
	public EmployeeController()
	{
		System.out.println("Employee Controller init");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Employee Controller hashcode :"+this.hashCode()+" "+
						   "User Object Hashcode :"+user.hashCode());
	}
	
	
	public ResponseEntity<String> getUserDetails()
	{
		System.out.println("Fetch user api");
		return ResponseEntity.status(HttpStatus.OK).body("Ok");
	}
}
