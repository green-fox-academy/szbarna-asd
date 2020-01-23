package com.greenfoxacademy.bankofsimba;

public class BankAccount {
    private String name;
    private long balance;
    private AnimalType animalType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public BankAccount(String name, long balance, AnimalType animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }
}
