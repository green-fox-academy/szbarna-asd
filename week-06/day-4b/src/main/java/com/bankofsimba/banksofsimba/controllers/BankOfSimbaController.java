package com.bankofsimba.banksofsimba.controllers;

import com.bankofsimba.banksofsimba.models.AnimalType;
import com.bankofsimba.banksofsimba.models.BankAccount;
import com.bankofsimba.banksofsimba.models.CurrencyType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankOfSimbaController {
    List<BankAccount> bankAccounts = new ArrayList<>();

    public BankOfSimbaController() {
        BankAccount bankAccount1 = new BankAccount("Simba", 2000, AnimalType.LION, CurrencyType.LION);
        BankAccount bankAccount2 = new BankAccount("Zebra",  2000, AnimalType.ZEBRA, CurrencyType.ZEBRA);

        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);
    }

    @GetMapping("/show")
    public String accountInformation(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);

        return "index";
    }


    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("text1", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        model.addAttribute("text2", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");

        return "ception";
    }
}
