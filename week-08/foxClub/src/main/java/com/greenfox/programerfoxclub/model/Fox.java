package com.greenfox.programerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<Trick> trickList;
    private Beverage drink;
    private Beverage food;

    public Fox() {
        this.name = "joskapista";
        this.trickList = new ArrayList<>();
    }

    public Fox(String name) {
        this.name = name;
        this.trickList = new ArrayList<>();
        this.drink = Beverage.BEER;
        this.food = Beverage.HOTDOG;
    }

    public Fox(String name, Beverage drink, Beverage food) {
        this.name = name;
        this.drink = drink;
        this.food = food;
        this.trickList = new ArrayList<>();
    }

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
}
