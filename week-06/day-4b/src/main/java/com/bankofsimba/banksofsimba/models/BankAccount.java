package com.bankofsimba.banksofsimba.models;

public class BankAccount {
    private String name;
    private float balance;
    private AnimalType animalType;
    private CurrencyType currency;
    private boolean isKing;

    public String getName() {
        return name;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public BankAccount(String name, float balance, AnimalType animalType, CurrencyType currencyType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currencyType;
        this.isKing = isKing;
    }

    public String shinyMaker() {
        return isKing ? "yellow" : "";
    }
}
