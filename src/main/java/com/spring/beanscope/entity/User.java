package com.spring.beanscope.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class User 
{

	public User() 
	{
		System.out.println("User Initialzed");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("User Object HashCode :"+this.hashCode());
	}
	
}
