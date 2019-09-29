package com.najeeb.todomanagementtool.service;

import com.najeeb.todomanagementtool.model.User;

public interface UserService {
    
	void save(User user);
    User findByUsername(String username);
    
}