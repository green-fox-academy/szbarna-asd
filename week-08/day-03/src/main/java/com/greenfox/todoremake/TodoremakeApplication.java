package com.greenfox.todoremake;

import com.greenfox.todoremake.domains.Todo;
import com.greenfox.todoremake.repos.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoremakeApplication implements CommandLineRunner {
    TodoRepo todoRepo;

    @Autowired
    public TodoremakeApplication(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoremakeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepo.save(new Todo(1L, "Szarjál Sünt", false, false));
    }
}
