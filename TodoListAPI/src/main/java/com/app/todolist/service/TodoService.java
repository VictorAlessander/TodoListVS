/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.todolist.service;

import com.app.todolist.entity.Todo;
import com.app.todolist.repository.TodoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vagr
 */
@Service
public class TodoService {
    
    @Autowired
    TodoRepository mytodo;
    
    public List<Todo> listTodos(){
        return mytodo.findAll();
    }
    
    public List<Todo> saveTodo(Todo todoAdd){
        mytodo.save(todoAdd);
        
        return mytodo.findAll();
    }
    
    public Todo getTodo(String id){
        return mytodo.findOne(id);
    }
    
    public void deleteTodo(String id){
        mytodo.delete(id);
    }

}
