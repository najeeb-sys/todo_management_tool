package com.najeeb.todomanagementtool.service;

import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.najeeb.todomanagementtool.model.User;
import com.najeeb.todomanagementtool.repository.RoleRepository;
import com.najeeb.todomanagementtool.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;


private static final Logger logger = LoggerFactory.getLogger
(UserServiceImpl.class);

	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(new HashSet<>(roleRepository.findAll()));
		userRepository.save(user);
		
		logger.info(String.format("User  Saved successfully!", user.getUsername()));
	}

	@Override
	public User findByUsername(String username) {
		
		logger.info(String.format("Retrieving ::%s:: User by Name:", username));
		
		return userRepository.findByUsername(username);
	
	

	}
}
