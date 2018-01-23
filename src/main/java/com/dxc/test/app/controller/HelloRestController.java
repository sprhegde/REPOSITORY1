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
		
		
		String sendEmailResult="";
		
		SendGrid sendgrid = new SendGrid("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");
		SendGrid.Email welcomeMail = new SendGrid.Email();
		welcomeMail.addTo("shivaprasad.hegde@hpe.com");
		welcomeMail.addToName("User-san");
		welcomeMail.setFrom("welcome@example.com");
		welcomeMail.setSubject("Welcome to Example!");
		welcomeMail.setText("Thank you for your interest in Example.com! It is still in Beta at the moment but there are a number of exciting features planned. Tell us what you'd like to see.");

		try {
		    SendGrid.Response response = sendgrid.send(welcomeMail);
		    sendEmailResult=response.getMessage();
		} catch (SendGridException sge) {
			 sendEmailResult="ERROR IS"+sge.getMessage();
		}
		
		
		return "This is my first sample REST service application with Spring Boot Technology- "+name+" Email Result is "+sendEmailResult;
		
	}

}
