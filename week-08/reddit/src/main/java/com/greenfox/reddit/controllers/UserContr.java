package com.greenfox.reddit.controllers;

import com.greenfox.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserContr {
    private UserService userService;

    @Autowired
    public UserContr(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/","/login"})
    public String login() {
        return "/login";
    }

    @PostMapping("/login")
    public String login2(@RequestParam(value = "name",required = false) String name) {
        userService.addUser(name);
        return "redirect:/posts";
    }
}
