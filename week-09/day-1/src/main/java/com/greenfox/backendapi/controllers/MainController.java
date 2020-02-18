package com.greenfox.backendapi.controllers;

import com.greenfox.backendapi.domains.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

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
        if (name == null && title == null) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new Greet());
        } else if (title == null) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new Greet("Please provide a title!"));
        }
        return ResponseEntity.ok(new Greet(name, title));
    }

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public ResponseEntity<Append> greeting(@PathVariable String appendable) {
        if (appendable == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Append());
        } else {
            return ResponseEntity.ok().body(new Append(appendable + "a"));
        }
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<DoItTill> doUntil(@PathVariable String action, @RequestBody(required = false) Until until) {
        if (until.getUntil() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new DoItTill(action, null));
        } else {
            return ResponseEntity.ok().body(new DoItTill(action, until.getUntil()));
        }
    }

    @PostMapping("/arrays")
    public ResponseEntity<ArrayInAction> arrayActions(@RequestBody(required = false) ArrayAction arrayAction) {

        if (arrayAction.getWhat() == null || arrayAction.getNumbers() == null) {
            return ResponseEntity.badRequest().body(new ArrayInAction(null, null));
        } else {
            return ResponseEntity.ok().body(new ArrayInAction(arrayAction.getWhat(), arrayAction.getNumbers()));
        }
    }
}
