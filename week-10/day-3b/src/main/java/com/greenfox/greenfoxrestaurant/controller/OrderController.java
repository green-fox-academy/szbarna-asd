package com.greenfox.greenfoxrestaurant.controller;

import com.greenfox.greenfoxrestaurant.domain.Orders;
import com.greenfox.greenfoxrestaurant.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public String openPage() {
        return "index";
    }

    @PostMapping("/order")
    public String sendOrder(@RequestParam String name, @RequestParam String address, @RequestParam String foodBase, @RequestParam String foodTopping, Model model) {
        model.addAttribute("order", new Orders(name, address, foodBase, foodTopping));
        return "order";
    }


    @GetMapping("/order/{orderId}")
    public String showOrderById(Model model, @PathVariable String orderId) {
        orderService.findById();
        return "order";
    }
}
