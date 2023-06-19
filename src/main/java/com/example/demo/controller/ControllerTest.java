package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	@GetMapping("/hello")
	public String getHello() {
		return "Hello anh duong nhé";
	}
}
