package com.greenfox.listingtodos.services;

import com.greenfox.listingtodos.domains.Todo;
import com.greenfox.listingtodos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TodoServiceImpl implements TodoService {
    TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getToDos() {
        return StreamSupport.stream(todoRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public void addToDo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public Todo getToDo(Long id) {
        Optional<Todo> optionalPokemon = todoRepository.findById(id);
        return optionalPokemon.orElse(null);
    }

    @Override
    public Todo updateToDo(Long id, Todo todo) {
        return null;
    }
}
