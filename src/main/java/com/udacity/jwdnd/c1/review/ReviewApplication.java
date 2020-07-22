package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan
//(basePackages= {"com.udacity.jwdnd.c1.review.AnimalController"})
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	/*
	@Bean
	public String message() {
	System.out.println("Inside message()..");
	return "Hello, spring!";
	}


	@Bean
	public String uppercaseMessage(MessageService messageservice){
		System.out.println("Inside uppercaseMessage ");
		return messageservice.upperCase();
	}

	@Bean
	public String lowercaseMessage(MessageService messageservice){
		System.out.println("Inside lowercaseMessage ");
		return messageservice.lowerCase();
	}
	*/

}


