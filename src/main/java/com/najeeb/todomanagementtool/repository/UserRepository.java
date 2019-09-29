package com.najeeb.todomanagementtool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.najeeb.todomanagementtool.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
