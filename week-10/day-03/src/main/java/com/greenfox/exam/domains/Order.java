package com.greenfox.exam.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String address;
    private Bases bases;
    private Toppings toppings;

    public Order(String name, String address, Bases bases, Toppings toppings) {
        this.name = name;
        this.address = address;
        this.bases = bases;
        this.toppings = toppings;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Bases getBases() {
        return bases;
    }

    public void setBases(Bases bases) {
        this.bases = bases;
    }

    public Toppings getToppings() {
        return toppings;
    }

    public void setToppings(Toppings toppings) {
        this.toppings = toppings;
    }
}
