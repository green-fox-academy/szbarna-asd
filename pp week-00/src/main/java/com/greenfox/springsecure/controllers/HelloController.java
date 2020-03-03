package com.greenfox.springsecure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "user-index";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "admin-index";
    }
}
