package com.greenfox.programerfoxclub.repository;

import com.greenfox.programerfoxclub.model.Fox;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoxClubRepo {
    private List<Fox> foxList;

    public FoxClubRepo() {
        this.foxList = new ArrayList<>();
    }

    public Fox findFoxByName(String name){
     return foxList
                .stream()
                .filter(fox -> fox.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public void addNewFox(String name) {
        this.foxList.add(new Fox(name));
    }

    public boolean isFoxPresent(String name) {
        return foxList
                .stream()
                .filter(fox -> fox.getName().equals(name))
                .findAny()
                .isPresent();
    }

    public void changeFox(Fox fox) {
        for (Fox fox1: foxList) {
            if (fox1.getName().equals(fox.getName())){
                fox1.setDrink(fox.getDrink());
                fox1.setFood(fox.getFood());
            }
        }
    }
}
