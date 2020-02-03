package com.greenfox.programerfoxclub.model;

import java.util.List;

public class Fox {
    private String name;
    private List<Trick> trickList;
    private Beverage drink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trick> getTrickList() {
        return trickList;
    }

    public void setTrickList(List<Trick> trickList) {
        this.trickList = trickList;
    }

    public Beverage getDrink() {
        return drink;
    }

    public void setDrink(Beverage drink) {
        this.drink = drink;
    }

    public Beverage getFood() {
        return food;
    }

    public void setFood(Beverage food) {
        this.food = food;
    }

    private Beverage food;
}
