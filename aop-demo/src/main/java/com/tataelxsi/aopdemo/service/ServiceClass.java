package com.tataelxsi.aopdemo.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	Logger logger=Logger.getLogger(ServiceClass.class.getName());
	
	public void hello() {
		logger.info("Hello, user");
	}
	public void greet(String name) {
		logger.info("Welcome "+name);
	}

}
