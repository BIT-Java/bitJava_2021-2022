package com.company;

public class Ork extends Monster{
    public Ork(int health, int damage) {
        super(health, damage);
    }

    public void warming(){
        System.out.println("ork is warming up...");
    }

    @Override
    public String toString() {
        return "Ork{" +
                "health=" + health +
                ", damage=" + damage +
                '}';
    }
}
