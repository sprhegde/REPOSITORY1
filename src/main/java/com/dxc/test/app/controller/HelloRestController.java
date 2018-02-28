package com.dxc.test.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;
/*
 * This project is created with 'New Maven Project'
 * try http://localhost:9393/hello in the browser.
 */
@RestController
public class HelloRestController {

	@RequestMapping("/hello")
	public String sayHi(@RequestParam(value="name", defaultValue="Rama") String name) {
		
		
		return "This is my first sample REST service application with Spring Boot Technology Hello- "+name;
		
	}

}
