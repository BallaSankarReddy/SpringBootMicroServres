package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController

@Slf4j
public class Democontroller {

	private static final Logger log = LoggerFactory.getLogger(Democontroller.class);

	@GetMapping("/display")
	public String display() {
		log.info("Calling from Get Request ...Methode..!");
		// System.out.println("Calling from Get Request ...Methode..!");
		return "Hello Spring Boot MicroService Controller...";
	}
}
