package com.greenfox.reddit;

import com.greenfox.reddit.domain.Post;
import com.greenfox.reddit.repo.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    RedditRepo redditRepo;

    @Autowired
    public RedditApplication(RedditRepo redditRepo) {
        this.redditRepo = redditRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        redditRepo.save(new Post("Index", "https://index.hu"));
        redditRepo.save(new Post("Index", "https://index.hu"));
        redditRepo.save(new Post("Index", "https://index.hu"));
        redditRepo.save(new Post("Index", "https://index.hu"));
        redditRepo.save(new Post("HVG", "https://hvg.hu"));
        redditRepo.save(new Post("HVG", "https://hvg.hu"));
        redditRepo.save(new Post("HVG", "https://hvg.hu"));
        redditRepo.save(new Post("HVG", "https://hvg.hu"));
        redditRepo.save(new Post("444", "https://444.hu"));
        redditRepo.save(new Post("444", "https://444.hu"));
        redditRepo.save(new Post("444", "https://444.hu"));
        redditRepo.save(new Post("444", "https://444.hu"));
    }
}
