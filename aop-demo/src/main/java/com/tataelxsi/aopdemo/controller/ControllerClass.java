package com.tataelxsi.aopdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tataelxsi.aopdemo.service.ServiceClass;

@RestController
@RequestMapping("/user")
public class ControllerClass {
	@Autowired
	private ServiceClass serviceClass;
	
	@GetMapping("/hello")
	public String userHello() {
		serviceClass.hello();  //prints in console
		return "Hello Service called"; // prints in webpage
		
	}
	@GetMapping("/greet/{name}")
		public String userGreet(@PathVariable String name) {
			serviceClass.greet(name);
			return "Greet Service called";
			
	}
	

}
