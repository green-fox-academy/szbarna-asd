package com.greenfox.reddit.service;

import com.greenfox.reddit.domain.User;
import com.greenfox.reddit.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    UserRepo userRepo;
    String uerName;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void addUser(String name) {
        if (!userRepo.findByName(name).stream().findFirst().isPresent()) {
            userRepo.save(new User(name));

        } else {
            userRepo.findByName(name);
        }
    }
}
