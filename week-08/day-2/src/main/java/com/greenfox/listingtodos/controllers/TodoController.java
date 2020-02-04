package com.greenfox.listingtodos.controllers;

import com.greenfox.listingtodos.domains.Todo;
import com.greenfox.listingtodos.repositories.TodoRepository;
import com.greenfox.listingtodos.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {
    TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        List<Todo> todoList = todoService.getToDos();
        model.addAttribute("todolist", todoList);
        return "todolist";
    }

    @PostMapping("/add")
    @ResponseBody
    public void addToDo(Todo todo){
        todoService.addToDo(todo);
    }
}
