package com.greenfox.todoremake.repos;

import com.greenfox.todoremake.domains.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {
    Todo findByTitle(String searchContent);
}
