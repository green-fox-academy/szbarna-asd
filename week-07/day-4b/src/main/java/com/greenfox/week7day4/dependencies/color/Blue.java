package com.greenfox.week7day4.dependencies.color;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Qualifier("blue")
public class Blue implements MyColor{
    @Override
    public void coloring() {
        System.out.println("It's blue colored");
    }
}
