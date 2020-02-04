package com.greenfox.listingtodos.services;

import com.greenfox.listingtodos.domains.Todo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TodoService {
    List<Todo> getToDos();
    void addToDo(Todo todo);
    Todo getToDo(Long id);
    Todo updateToDo(Long id, Todo todo);
}
