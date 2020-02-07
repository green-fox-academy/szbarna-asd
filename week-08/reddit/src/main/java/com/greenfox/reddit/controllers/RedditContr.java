package com.greenfox.reddit.controllers;

import com.greenfox.reddit.domain.Post;
import com.greenfox.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RedditContr {
    private RedditService redditService;

    @Autowired
    public RedditContr(RedditService redditService) {
        this.redditService = redditService;
    }

    @GetMapping("/posts")
    public String listOfPosts(Model model/*, @RequestParam String name*/) {
        model.addAttribute("posts", redditService.findAllOrderByLikeCounterDescFirstTen());
        //model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/post/2")
    public String listOfPosts2(Model model) {
        model.addAttribute("posts", redditService.findAllOrderByLikeCounterDescSecondTen());
        return "index";
    }

    @GetMapping("/change/{id}/{number}")
    public String changeCounter(@PathVariable Long id, @PathVariable("number") int number){
        redditService.change(id, number);
        return "redirect:/posts";
    }

   @GetMapping("/add-post")
    public String postMaker(Model model) {
       return "add-post";
   }

   @PostMapping("/add-post")
    public String addPost(@ModelAttribute Post post) {
       redditService.save(post);
       return "redirect:/posts";
   }
}
