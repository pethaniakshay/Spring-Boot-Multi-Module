package com.codepuran.profile.service;

import org.springframework.stereotype.Service;

import com.codepuran.dao.entity.User;

@Service
public class ProfileService {
	
	public User user;
	
	public String sayHello() {
		user.name = "sds";
		return "Hello";
	}

}
