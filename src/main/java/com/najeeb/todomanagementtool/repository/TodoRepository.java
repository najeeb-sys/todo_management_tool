package com.najeeb.todomanagementtool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.najeeb.todomanagementtool.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}
