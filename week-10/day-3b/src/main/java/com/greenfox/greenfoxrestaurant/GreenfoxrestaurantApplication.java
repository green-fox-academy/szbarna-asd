package com.greenfox.greenfoxrestaurant;

import com.greenfox.greenfoxrestaurant.domain.Orders;
import com.greenfox.greenfoxrestaurant.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreenfoxrestaurantApplication implements CommandLineRunner {

    OrderRepo orderRepo;

    @Autowired
    public GreenfoxrestaurantApplication(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(GreenfoxrestaurantApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        orderRepo.save(new Orders("asd", "asd", "asd", "asd"));
        orderRepo.save(new Orders("asd1", "asd1", "asd1", "asd1"));
        orderRepo.save(new Orders("asd2", "asd2", "asd2", "asd2"));
    }
}
