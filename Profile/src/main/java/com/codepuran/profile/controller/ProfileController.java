package com.codepuran.profile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codepuran.core.Constants;

@RestController
@RequestMapping("/api")
public class ProfileController {

	private Long id;
	
	
	@GetMapping
	public String hello() {
		String name = Constants.name;
		return "Hello";
	}
}
