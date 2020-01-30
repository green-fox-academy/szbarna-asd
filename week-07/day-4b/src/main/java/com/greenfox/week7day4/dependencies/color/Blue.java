package com.greenfox.week7day4.dependencies.color;

import org.springframework.stereotype.Service;


public class Blue implements MyColor{
    @Override
    public void coloring() {
        System.out.println("It's blue colored");
    }
}
