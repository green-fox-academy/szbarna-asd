package com.greenfox.todoremake.controllers;

import com.greenfox.todoremake.domains.Todo;
import com.greenfox.todoremake.repos.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {
    TodoRepo todoRepo;

    @Autowired
    public TodoController(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todolist", todoRepo.findAll());
        return "index";
    }

    @PostMapping("/add")
    @ResponseBody
    public void addToDo(Todo todo){
        todoRepo.save(todo);
    }

    @GetMapping("/search")
    public String searchForTodo(Model model, @RequestParam String title) {
        model.addAttribute("todolist", todoRepo.findByTitle(title));
        return "index";
    }
}
