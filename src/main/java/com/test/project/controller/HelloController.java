package com.test.project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {
	
	@GetMapping(value = "/all")
	public String hello(){
		System.out.println("ddddddddd");
		return "hello world";
	}
	

}

