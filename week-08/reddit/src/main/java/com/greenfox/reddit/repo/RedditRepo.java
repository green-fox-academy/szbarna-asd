package com.greenfox.reddit.repo;

import com.greenfox.reddit.domain.Post;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedditRepo extends CrudRepository<Post, Long> {
    @Query(value = "select * from post order by like_counter desc limit 10", nativeQuery = true)
    List<Post> findAllOrderByLikeCounterDesc();

    //Post findById(Long id);
}
