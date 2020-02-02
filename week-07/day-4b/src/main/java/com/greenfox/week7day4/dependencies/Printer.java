package com.greenfox.week7day4.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Component
@Qualifier("printer")
public class Printer {
    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}
