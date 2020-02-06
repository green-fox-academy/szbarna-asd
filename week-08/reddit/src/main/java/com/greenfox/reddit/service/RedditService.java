package com.greenfox.reddit.service;

import com.greenfox.reddit.domain.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RedditService {
    void save(Post post);

    List<Post> findAllOrderByLikeCounterDescFirstTen();

    void change(Long id, int number);

    List<Post> findAllOrderByLikeCounterDescSecondTen();
}
