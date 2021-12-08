package com.company;

public class Engine {
    private float capacity;
    private boolean isLaunched;

    public Engine(float capacity) {
        this.capacity = capacity;
    }

    public void switchOn() {
        System.out.println("switching on the engine.");
        isLaunched = true;
    }

    public void switchOff() {
        isLaunched = false;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", isLaunched=" + isLaunched +
                '}';
    }
}
