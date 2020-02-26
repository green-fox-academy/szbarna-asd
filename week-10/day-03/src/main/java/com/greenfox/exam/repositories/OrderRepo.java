package com.greenfox.exam.repositories;

import com.greenfox.exam.domains.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface OrderRepo extends CrudRepository<Order, Long> {

}
