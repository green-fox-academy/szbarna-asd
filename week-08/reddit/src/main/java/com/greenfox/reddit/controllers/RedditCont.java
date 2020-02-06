package com.greenfox.reddit.controllers;

import com.greenfox.reddit.domain.Post;
import com.greenfox.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RedditCont {
    private RedditService redditService;

    @Autowired
    public RedditCont(RedditService redditService) {
        this.redditService = redditService;
    }

    @GetMapping({"/", "/posts"})
    public String listOfPosts(Model model) {
        model.addAttribute("posts", redditService.findAllOrderByLikeCounterDesc());
        return "index";
    }

   /* @GetMapping("/change-counter")
    public String changeCounter(Model model)*/

   @GetMapping("/add-post")
    public String postMaker() {
       return "add-post";
   }

   @PostMapping("/add-post")
    public String addPost(@ModelAttribute Post post) {
       redditService.save(post);
       return "redirect:/";
   }

}
