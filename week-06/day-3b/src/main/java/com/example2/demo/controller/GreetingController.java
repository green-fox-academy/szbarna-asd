package com.example2.demo.controller;

import com.example2.demo.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(value="/greet")
    public Greeting greet(@RequestParam String name) {
        return new Greeting(0, "Hello " + name);
    }

}
