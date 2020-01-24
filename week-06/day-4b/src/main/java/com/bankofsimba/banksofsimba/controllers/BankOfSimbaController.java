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
    BankAccount simba;
    BankAccount zebra;
    BankAccount zordon;
    BankAccount timon;
    BankAccount pumba;
    BankAccount barna;

    public BankOfSimbaController() {
        bankAccounts.add(simba = new BankAccount("Simba", 2000, AnimalType.LION, CurrencyType.LION, true, true));
        bankAccounts.add(zebra = new BankAccount("Zebra",  2000, AnimalType.ZEBRA, CurrencyType.ZEBRA, false, true));
        bankAccounts.add(zordon = new BankAccount("Zordon",  4000, AnimalType.LION, CurrencyType.LION, false, false));
        bankAccounts.add(timon = new BankAccount("Timon",  10, AnimalType.MEERKATS, CurrencyType.MEERKATS, true, true));
        bankAccounts.add(pumba = new BankAccount("Pumba",  20, AnimalType.WARTHOG, CurrencyType.WARTHOG, true, true));
        bankAccounts.add(barna = new BankAccount("Barna",  1, AnimalType.HUMAN, CurrencyType.HUMAN, true, true));
        bankAccounts.add(barna = new BankAccount("Karin",  1000000, AnimalType.HUMAN, CurrencyType.HUMAN, true, false));
    }

    @GetMapping("/show")
    public String accountInformation(Model model) {
        model.addAttribute("bankAccount1", simba);
        model.addAttribute("bankAccount2", zebra);

        return "index";
    }


    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("text1", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        model.addAttribute("text2", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");

        return "ception";
    }

    @GetMapping("/account-list")
    public String accountList(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);

        return "list-of-accounts";
    }
}
