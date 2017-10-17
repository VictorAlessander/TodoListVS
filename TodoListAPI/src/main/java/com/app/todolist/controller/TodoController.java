/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.todolist.controller;

import com.app.todolist.entity.Todo;
import com.app.todolist.service.TodoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vagr
 */

@RestController
public class TodoController {
    
    @Autowired
    TodoService service;

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public List<Todo> todos(){
        return this.service.listTodos();
    }
    
    @RequestMapping(value = "/todos", method = RequestMethod.POST)
    public List<Todo> create(@RequestBody Todo todo){
        return this.service.saveTodo(todo);
    }
    
    @RequestMapping(value = "/todos/{id}", method = RequestMethod.GET)
    public Todo find(@PathVariable String id){
        return this.service.getTodo(id);
    }
    
    @RequestMapping(value = "/todos/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        this.service.deleteTodo(id);
    }
    
    @RequestMapping(value = "/todos", method = RequestMethod.PUT)
    public List<Todo> update(@RequestBody Todo todo){ 
        return this.service.saveTodo(todo);
    }
}
