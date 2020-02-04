package com.greenfox.listingtodos.repositories;

import com.greenfox.listingtodos.domains.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
