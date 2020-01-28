package com.greenfox.basicwebshop.basicwebshop.Models;

public class ShopItem implements Comparable<ShopItem>{
    private java.lang.String name;
    private java.lang.String description;
    private Integer price;
    private Integer amount;
    private ProductType type;

    public ProductType getType() {
        return type;
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    public ShopItem(java.lang.String name, java.lang.String description, Integer price, Integer amount, ProductType type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.type = type;
    }

    @Override
    public int compareTo(ShopItem o) {
        return this.price.compareTo(o.price);
    }

    public java.lang.String getNameAndDescription() {
        return getName() + getDescription();
    }
}
