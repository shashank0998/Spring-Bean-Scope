package com.spring.beanscope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.beanscope.entity.User;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/api")
@Scope("request")
public class UserController 
{
	@Autowired
	User user;

	public UserController() 
	{
		System.out.println("UserController init");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("user controller hashcode : "+this.hashCode() + " " +
						   "user object hashcode :"+user.hashCode());
	}
	
	@GetMapping("/fetchUser1")
	public ResponseEntity<String> getUserDetails()
	{
		System.out.println("Fetch user API");
		return ResponseEntity.status(HttpStatus.OK).body("Ok");
	}
	
}
