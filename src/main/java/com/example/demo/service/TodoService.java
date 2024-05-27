package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.todoItem.Todo;

@Service
public class TodoService {

	private List<Todo> allTodos = new ArrayList<> (Arrays.asList(
			new Todo("ID", "タイトル", "ステータス(未着手/進行中/完了)", "詳細")));
	
	public void addTodo(Todo todo) {
		allTodos.add(todo);
	}
	
	public List<Todo> getAllTodos(){
		return allTodos;
	}
	
	public String getTodoDetails(String todoId) {
		for(int i = 0; i < allTodos.size(); i++) {
			if(allTodos.get(i).getTodoId().equals(todoId)) {
				return (String)allTodos.get(i).getDetails();
			}
		}
		return null;
	}
	
	public void putTodo(String todoId, Todo Todo) {
		for(int i = 0; i < allTodos.size(); i++) {
			if(allTodos.get(i).getTodoId().equals(todoId)) {
				allTodos.get(i).setTodoId(Todo.getTodoId());
				allTodos.get(i).setTitle(Todo.getTitle());
				allTodos.get(i).setStatus(Todo.getStatus());
				allTodos.get(i).setDetails(Todo.getDetails());
			}
		}
		System.out.println("そのようなIDのTodoは存在しません");
	}
	
	public void deleteTodo(String todoId) {
		allTodos.removeIf(i -> i.getTodoId().equals(todoId));
	}
	
	
}
