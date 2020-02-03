package com.greenfox.programerfoxclub.repository;

import com.greenfox.programerfoxclub.model.Fox;

import java.util.ArrayList;
import java.util.List;

public class FoxClubRepo {
    List<Fox> foxList = new ArrayList<>();

    public FoxClubRepo(List<Fox> foxList) {
        this.foxList = foxList;
    }


}
