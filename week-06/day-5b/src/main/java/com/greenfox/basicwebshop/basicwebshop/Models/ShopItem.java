package com.greenfox.basicwebshop.basicwebshop.Models;

public class ShopItem implements Comparable<ShopItem>{
    public String name;
    public String description;
    public Integer price;
    public Integer amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public ShopItem(String name, String description, Integer price, Integer amount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public int compareTo(ShopItem o) {
        return this.price.compareTo(o.price);
    }
}
