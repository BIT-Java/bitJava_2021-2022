package com.company;

public class Monster {
    protected int health;
    protected int damage;

    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "health=" + health +
                ", damage=" + damage +
                '}';
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
