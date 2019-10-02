package com.najeeb.todomanagementtool.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.najeeb.todomanagementtool.model.Todo;
import com.najeeb.todomanagementtool.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository todoRepository;

	private static final Logger logger = LoggerFactory.getLogger
			(TodoServiceImpl.class);
	
	@Override
	public List<Todo> getTodosByUser(String user) {
		return todoRepository.findByUserName(user);
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		return todoRepository.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		todoRepository.save(todo);
		logger.info(String.format(todo.getDescription()+" has been UPDATED in to-do List Successfully :"));

	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, Date creationDate, String status, boolean isDone) {
		todoRepository.save(new Todo(name, desc, targetDate, creationDate,status, isDone));
		logger.info(String.format(name+" :: "+desc+" has been ADDED in to-do List Successfully :"));

	}

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
		
		logger.info(String.format(todo.get().getDescription()+" has been DELETED in to-do List Successfully :"));

	}

	@Override
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
		logger.info(String.format(todo.getUserName()+" :: "+todo.getDescription()+" has been SAVED in to-do List Successfully :"));

	}
}