package com.greenfox.todoremake.controllers;

import com.greenfox.todoremake.domains.Assignee;
import com.greenfox.todoremake.domains.Todo;
import com.greenfox.todoremake.repos.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class AssigneeController {
    AssigneeRepo assigneeRepo;

    @Autowired
    public AssigneeController(AssigneeRepo assigneeRepo) {
        this.assigneeRepo = assigneeRepo;
    }

    @PostMapping("/add-assignee")
    public String addAssignee(@ModelAttribute Assignee assignee){
       assigneeRepo.save(assignee);
       return "redirect:/todo/assignee-list";
    }

    @GetMapping("/assignee-list")
    public String listOfAssignee(Model model) {
        model.addAttribute("assignees", assigneeRepo.findAll());
        return "assignee";
    }
}
