package com.greenfox.reddit.service;

import com.greenfox.reddit.domain.Post;
import com.greenfox.reddit.repo.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedditServiceImpl implements RedditService{
    private RedditRepo redditRepo;

    @Autowired
    public RedditServiceImpl(RedditRepo redditRepo) {
        this.redditRepo = redditRepo;
    }

    @Override
    public List<Post> findAll() {
        return (List<Post>) redditRepo.findAll();
    }

    @Override
    public void save(Post post) {
        redditRepo.save(post);
    }

    @Override
    public List<Post> findAllOrderByLikeCounterDesc() {
        return (List<Post>) redditRepo.findAllOrderByLikeCounterDesc();
    }
}
