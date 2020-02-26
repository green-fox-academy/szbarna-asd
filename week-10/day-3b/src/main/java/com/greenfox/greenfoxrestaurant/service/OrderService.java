package com.greenfox.greenfoxrestaurant.service;

import com.greenfox.greenfoxrestaurant.domain.Orders;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface OrderService {

    Optional<Orders> findById(Long id);

    void addOrder(Orders order);
}
