package com.pablo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pablo.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	protected UserService userService;
	
	protected ObjectMapper mapper;
}
