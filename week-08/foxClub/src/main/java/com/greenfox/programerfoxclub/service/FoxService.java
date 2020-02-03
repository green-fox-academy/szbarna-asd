package com.greenfox.programerfoxclub.service;

import com.greenfox.programerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoxService {
    public void addFox(String name);

    List<Fox> foxList();

    public String showInfo(Fox fox);
}
