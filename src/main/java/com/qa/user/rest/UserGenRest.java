package com.qa.user.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.user.service.UserService;

@RequestMapping("${path.base}")
@RestController
public class UserGenRest {

	@Autowired
	private UserService service;

	@GetMapping("${path.createUserName}")
	public String createUserName() {
		return service.createUserName();
	}
}
