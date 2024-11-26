package com.spring.beanscope.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


public class Employee 
{
	
	public Employee()
	{
		System.out.println("Employee Initialzed");
	}
	
	
	
}
