package com.zensar.webapp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Writing test case for every pieces business code including spring controller is mandate
@RestController
public class HelloProgramController {

	@GetMapping("/greet")
	public String sayHello()
	{
		System.out.println("Testing say hello");
		return "Welcome to hello";
	}
	
	@PostMapping("/greet")
	public ResponseEntity<String> createMessage(@RequestBody String msg)
	{
		System.out.println("Creating message");
		return new ResponseEntity<String>("Message created "+msg,HttpStatus.CREATED);
	}

}
