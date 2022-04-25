
package com.springreact.Springreactintegration.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.Springreactintegration.SpringReactIntegrationApplication;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HomeController {
	private static final Logger logger=LogManager.getLogger(SpringReactIntegrationApplication.class);
	@GetMapping("/home")
	public String helloWorld() {
		logger.info("Inside HelloWorld() method from logger");
		System.out.println("Inside HelloWorld() method");
		return "Hello World";
	}
	@GetMapping("/home/{name}")
	public String helloName(@PathVariable String name) {
		System.out.println("Inside HelloWorld() method "+ name );
		return "Hello " + name;
	}
	@GetMapping("/message/{firsName}/{lastName}")
	public String helloName(@PathVariable String firsName,@PathVariable String lastName) {
		System.out.println("Inside HelloWorld() method "+ firsName + " " + lastName );
		return "Hello " + firsName + " " + lastName;
	}
	
	@PostMapping("/saveDetails")
	public ResponseEntity<?> saveDetails(@RequestBody Request req) {
		System.out.println("Request"+req.getEmailId());
		System.out.println("Request"+req.getFirst());
		try {
			return ResponseEntity.ok(new Request(req.getFirst(), req.getLast(), req.getEmailId(), req.getPanNumber(),req.getGender()));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}
