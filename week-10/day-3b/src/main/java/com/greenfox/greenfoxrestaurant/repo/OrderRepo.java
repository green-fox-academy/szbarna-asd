package com.greenfox.greenfoxrestaurant.repo;

import com.greenfox.greenfoxrestaurant.domain.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<Orders, Long> {
}
