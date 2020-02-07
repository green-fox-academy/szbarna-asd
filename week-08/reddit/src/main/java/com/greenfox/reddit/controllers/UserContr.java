package com.greenfox.reddit.controllers;

import com.greenfox.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String loginPage() {
        return "/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam(value = "name",required = false) String name) {
        userService.addUser(name);
        return "redirect:/posts?name=" + name; ///posts?name=" + name
    }

   /* @GetMapping("/change/{id}/{number}")
    public String changeCounter(@PathVariable Long id, @PathVariable("number") int number){
        redditService.change(id, number);
        return "redirect:/posts";
    }*/
}
