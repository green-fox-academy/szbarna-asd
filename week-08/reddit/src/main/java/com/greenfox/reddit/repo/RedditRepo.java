package com.greenfox.reddit.repo;

import com.greenfox.reddit.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedditRepo extends CrudRepository<Post, Long> {
    //Post findById(Long id);
}
