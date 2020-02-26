package com.greenfox.exam;

import com.greenfox.exam.domains.Bases;
import com.greenfox.exam.domains.Order;
import com.greenfox.exam.domains.Toppings;
import com.greenfox.exam.repositories.OrderRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner {
    OrderRepo orderRepo;

    public ExamApplication(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        orderRepo.save(new Order("asd", "asd123", Bases.EGG_NOODLE, Toppings.BEEF));
        orderRepo.save(new Order("asd1", "asd234", Bases.RICE_NOODLE, Toppings.BEEF));
        orderRepo.save(new Order("asd2", "asd345", Bases.WHITE_RICE, Toppings.SMOKED_TOFU));
        orderRepo.save(new Order("asd3", "asd456", Bases.WHITE_RICE, Toppings.BEEF));
        orderRepo.save(new Order("asd4", "asd567", Bases.RICE_NOODLE, Toppings.CHICKEN));
        orderRepo.save(new Order("asd5", "asd678", Bases.EGG_NOODLE, Toppings.BEEF));
    }
}
