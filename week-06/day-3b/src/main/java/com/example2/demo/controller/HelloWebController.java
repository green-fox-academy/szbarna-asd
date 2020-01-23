package com.example2.demo.controller;

import com.example2.demo.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        Greeting greeting = new Greeting(0);
        model.addAttribute("name2", name);
        model.addAttribute("greetingCounter", greeting);
        return "greeting";
    }
}
