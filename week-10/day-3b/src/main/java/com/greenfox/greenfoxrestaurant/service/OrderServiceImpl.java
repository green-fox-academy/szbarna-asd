package com.greenfox.greenfoxrestaurant.service;

import com.greenfox.greenfoxrestaurant.domain.Orders;
import com.greenfox.greenfoxrestaurant.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepo orderRepo;

    @Autowired
    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public Optional<Orders> findById(Long id) {
        return orderRepo.findById(id);
    }

    @Override
    public void addOrder(Orders order) {
        orderRepo.save(order);
    }
}
