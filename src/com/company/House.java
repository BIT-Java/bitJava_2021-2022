package com.company;

public class House {
    String owner;
    double price;
    int age;
    boolean isForSale;

    public House(String owner, double price, int age, boolean isForSale) {
        this.owner = owner;
        this.price = price;
        this.age = age;
        this.isForSale = isForSale;
    }

    void changeOwner(String newOwner) {
        owner = newOwner;
    }

    void makeCheaper() {
        price = price - 100;
    }

}
