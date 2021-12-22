package com.springreact.Springreactintegration.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HomeController {
	@GetMapping("/home")
	public String helloWorld() {
		System.out.println("Inside HelloWorld() method");
		return "Hello World";
	}
	@GetMapping("/home/{name}")
	public String helloName(@PathVariable String name) {
		System.out.println("Inside HelloWorld() method "+ name );
		return "Hello " + name;
	}
}
