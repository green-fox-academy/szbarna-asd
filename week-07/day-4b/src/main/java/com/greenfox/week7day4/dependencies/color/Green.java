package com.greenfox.week7day4.dependencies.color;

import org.springframework.stereotype.Service;

@Service
public class Green implements MyColor{
    @Override
    public void coloring() {
        System.out.println("It's green colored");
    }
}
