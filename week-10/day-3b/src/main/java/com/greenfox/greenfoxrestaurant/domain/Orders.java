package com.greenfox.greenfoxrestaurant.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
    @Id
    @GeneratedValue
    private Long orderId;

    private String name;
    private String address;
    private String foodBase;
    private String foodTopping;

    public Orders(String name, String address, String foodBase, String foodTopping) {
        this.name = name;
        this.address = address;
        this.foodBase = foodBase;
        this.foodTopping = foodTopping;
    }

    public Orders() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public String getFoodBase() {
        return foodBase;
    }

    public void setFoodBase(String foodBase) {
        this.foodBase = foodBase;
    }

    public String getFoodTopping() {
        return foodTopping;
    }

    public void setFoodTopping(String foodTopping) {
        this.foodTopping = foodTopping;
    }
}
