package com.greenfox.reddit.service;

import com.greenfox.reddit.domain.Post;
import com.greenfox.reddit.repo.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RedditServiceImpl implements RedditService{
    private RedditRepo redditRepo;

    @Autowired
    public RedditServiceImpl(RedditRepo redditRepo) {
        this.redditRepo = redditRepo;
    }

    @Override
    public void save(Post post) {
        redditRepo.save(post);
    }

    @Override
    public List<Post> findAllOrderByLikeCounterDescFirstTen() {
        return redditRepo.findAllOrderByLikeCounterDescFirstTen();
    }

    @Override
    public void change(Long id, int number) {
        Optional<Post> postToChange = redditRepo.findById(id);
        if (postToChange.isPresent()){
            postToChange.get().setLikeCounter(number);
            redditRepo.save(postToChange.get());
        }
    }

    @Override
    public List<Post> findAllOrderByLikeCounterDescSecondTen() {
        return redditRepo.findAllOrderByLikeCounterDescSecondTen();
    }
}
