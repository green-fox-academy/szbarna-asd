package com.greenfox.reddit.controllers;

import com.greenfox.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedditCont {
    private RedditService redditService;

    @Autowired
    public RedditCont(RedditService redditService) {
        this.redditService = redditService;
    }

    @GetMapping({"/", "/posts"})
    public String listOfPosts(Model model) {
        model.addAttribute("posts", redditService.findAll());
        return "index";
    }

}
