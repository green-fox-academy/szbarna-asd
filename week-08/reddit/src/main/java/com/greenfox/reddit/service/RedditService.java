package com.greenfox.reddit.service;

import com.greenfox.reddit.domain.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RedditService {

    List<Post> findAll();

    void save(Post post);
}
