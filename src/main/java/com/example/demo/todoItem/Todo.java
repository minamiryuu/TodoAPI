package com.example.demo.todoItem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {

	private String todoId;
	private String title; 
	private String status; 
	private String details; 
	
}
