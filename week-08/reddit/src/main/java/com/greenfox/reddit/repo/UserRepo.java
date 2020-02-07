package com.greenfox.reddit.repo;

import com.greenfox.reddit.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findByName(String name);

}
