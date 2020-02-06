package com.greenfox.reddit.service;

import com.greenfox.reddit.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void addUser(String name);
}
