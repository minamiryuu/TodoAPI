package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TodoService;
import com.example.demo.todoItem.Todo;

@RestController
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	@PostMapping("/todos")
	public void addTodo(@RequestBody Todo todo) {
		todoService.addTodo(todo);
	}
		
	@GetMapping("/todos")
	public List<Todo> getAllTodos(){
		return todoService.getAllTodos();
	}
	
	@GetMapping("/todos/{todoId}")
	public String getTodoDetails(@PathVariable("todoId") String todoId) {
		return todoService.getTodoDetails(todoId);
	}
	
	@PutMapping("/todos/{todoId}")
	public void putTodo(@PathVariable("todoId") String todoId, @RequestBody Todo Todo) {
		todoService.putTodo(todoId, Todo);
	}
	
	@DeleteMapping("/todos/{todoId}")
	public void deleteTodo(@PathVariable("todoId") String todoId) {
		todoService.deleteTodo(todoId);
	}
	
}
