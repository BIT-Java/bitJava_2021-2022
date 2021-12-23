package com.company;

public class Wolf extends Monster{

    public Wolf(int health, int damage) {
        super(health, damage);
    }

    public void eating(){
        System.out.println("wolf is eating...");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "health=" + health +
                ", damage=" + damage +
                '}';
    }
}
