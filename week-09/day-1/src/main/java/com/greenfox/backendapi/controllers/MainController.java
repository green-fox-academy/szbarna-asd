package com.greenfox.backendapi.controllers;

import com.greenfox.backendapi.domains.Doubling;
import com.greenfox.backendapi.domains.Greet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    Greet greet;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Doubling doubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            return new Doubling(input);
        } else {
            return new Doubling();
        }
    }

    @GetMapping("/greeter")
    @ResponseBody
    public ResponseEntity<Greet> greeting(@RequestParam(required = false) String name,
                                          @RequestParam(required = false) String title) {
        if (name == null && title == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    greet = new Greet()
            );
        }else if (title == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    greet = new Greet("Please provide a title!")
            );
        }
        return ResponseEntity.ok(greet = new Greet(name, title));
    }
}
