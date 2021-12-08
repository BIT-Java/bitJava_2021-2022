package com.company;

public class Bicycle {
    private int currentGear;
    private float currentSpeed;
    private String color;

    public Bicycle(String color) {
        currentGear = 2;
        currentSpeed = 0;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void speedUp(float amount) {
        currentSpeed = currentSpeed + amount;
    }

    public void slowDown() {
        currentSpeed = currentSpeed - 10f;
    }

    public void changeGearUp() {
        currentGear = currentGear + 1;
    }

    public void changeGearDown() {
        currentGear = currentGear - 1;
    }

    public String toString() {
        return String.format("Bicycle %d running at %d gear\nwith speed %f", currentGear, currentSpeed);
    }
}
