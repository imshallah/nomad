package com.daq.boot.controller;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController;

import com.daq.boot.model.HelloBean; 
@RestController 
public class BootRestController {
//	http://localhost:8080/hello-world
	@GetMapping("/hello-world") 
	public String index() { 
		return "Hello java spring boot!"; 
	} 
//	@GetMapping("/hello-bean") 
//	public HelloBean bean2() { 
//		return new  HelloBean("Hello Bean!"); 
//	} 
}
