/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.todolist.repository;

import com.app.todolist.entity.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author vagr
 */

public interface TodoRepository extends MongoRepository<Todo, String>{
    
}
