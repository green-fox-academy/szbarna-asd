package com.greenfox.programerfoxclub.service;

import com.greenfox.programerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoxService {
    void addFox(String name);

    List<Fox> foxList();

    String showInfo(Fox fox);

    Fox findFoxByName(String name);

    boolean isFoxPresent(String name);

    void changeFox(Fox fox);
}
