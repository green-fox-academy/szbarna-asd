package com.greenfox.todoremake.repos;

import com.greenfox.todoremake.domains.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepo extends CrudRepository<Assignee, Long> {
}
