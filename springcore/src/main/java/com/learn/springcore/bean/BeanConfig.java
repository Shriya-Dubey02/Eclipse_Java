package com.learn.springcore.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public Student s1()
	{
		return new Student(101, "Shriya", null);
	}
	
	@Bean
	public School school1() 
	{
		return new School(685, "National School");
	}
	@Bean
	public School school2()
	{
		return new School(686,"Holy Cross");
	}

}
