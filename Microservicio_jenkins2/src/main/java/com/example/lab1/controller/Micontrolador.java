package com.example.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Micontrolador {
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}

}
