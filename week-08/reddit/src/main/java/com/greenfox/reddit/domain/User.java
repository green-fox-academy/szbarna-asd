package com.greenfox.reddit.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany
    private List<Post> posts;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
