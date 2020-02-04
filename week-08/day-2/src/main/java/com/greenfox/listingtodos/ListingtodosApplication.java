package com.greenfox.listingtodos;

import com.greenfox.listingtodos.domains.Todo;
import com.greenfox.listingtodos.repositories.TodoRepository;
import com.greenfox.listingtodos.services.TodoService;
import com.greenfox.listingtodos.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {
    TodoService todoService;

    @Autowired
    public ListingtodosApplication(TodoService todoService) {
        this.todoService = todoService;
    }
    public static void main(String[] args) {
        SpringApplication.run(ListingtodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoService.addToDo(new Todo(1L, "asd", true, true));
    }
}
