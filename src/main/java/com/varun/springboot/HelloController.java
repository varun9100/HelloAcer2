package com.varun.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
	@RequestMapping("/hello")
	public String hello() {
		return "Hello from Spring boot Acer";
	}
}
