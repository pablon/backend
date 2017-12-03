package com.pablo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pablo.demo.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	protected UserRepository userRepository;
}
