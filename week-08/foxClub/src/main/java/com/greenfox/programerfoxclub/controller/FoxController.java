package com.greenfox.programerfoxclub.controller;

import com.greenfox.programerfoxclub.model.Beverage;
import com.greenfox.programerfoxclub.model.Fox;
import com.greenfox.programerfoxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
    FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(value = "name", required = false) String name) {
        if (name == null || name.equals("") || !foxService.isFoxPresent(name)){
            return "redirect:/login";
        }
        model.addAttribute("fox", foxService.findFoxByName(name));
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login2(@RequestParam (value = "name2",required = false) String name2) {
        foxService.addFox(name2);
        return "redirect:/?name="+name2;
    }

   /* @GetMapping("/nutrition-store")
    public String getNutritionStore(@RequestParam(value = "name") String name, Model model){
        model.addAttribute("name", name);
        return "nutrition-store";
    }*/

    /*@PostMapping("/nutrition-store")
    public String changeDrinkAndFood(@ModelAttribute Fox fox){
        foxService.changeFox(fox);
        return "redirect:/?name=" +fox.getName();
    }*/
}
