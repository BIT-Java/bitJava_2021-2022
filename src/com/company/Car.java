package com.company;

public class Car {
    private float price;
    private String brand;
    private float fuel;
    private float speed;
    private Engine engine;
    private boolean isLaunched;

    public Car(float price, String brand, float fuel, Engine engine) {
        this.price = price;
        this.brand = brand;
        this.fuel = fuel;
        this.engine = engine;
        this.speed = 0f;
        this.isLaunched = false;
    }

    public Car() {

    }

    public Car(String brand) {
        this.brand = brand;
    }

    public float getFuel() {
        return fuel;
    }

    public void start() {
        if (isLaunched) {
            System.out.println("Car is already running!");
            return;
        }
        if (fuel < 5) {
            System.out.println("Car can't start - too little fuel.");
        }
        fuel -= 5;
        engine.switchOn();
    }

    public void accelerate() {
        if (!isLaunched) {
            System.out.println("Car needs to be launched first!");
            return;
        }
        if (fuel < 2) {
            System.out.println("Car can't accelerate - too little fuel.");
            return;
        }
        fuel -= 2;
        speed += 10;
    }

    public void brake() {
        if (!isLaunched) {
            System.out.println("Car needs to be launched first!");
            return;
        }
        if (fuel < 2) {
            System.out.println("Car can't brake - too little fuel.");
            return;
        }
        fuel -= 2;
        speed = Math.min(speed - 10, 0);
    }

    public void drive(int distanceInKilometers) {
        if (!isLaunched) {
            System.out.println("Car needs to be launched first!");
            return;
        }
        float neededFuel = distanceInKilometers * 0.04f;
        if (neededFuel > fuel) {
            System.out.println("Car can't drive for " + distanceInKilometers + ". " + neededFuel + " of fuel is needed.");
            return;
        }
        fuel -= neededFuel;
    }

    public void brakeHard() {
        if (!isLaunched) {
            System.out.println("Car needs to be launched first!");
            return;
        }
        if (fuel < 5) {
            System.out.println("Car can't break hard - too little fuel.");
        }
        speed = 0;
        fuel -= 5;
    }

    public void addFuel(float amount) {
        if (amount < 0) {
            System.out.println("can't add " + amount + " of fuel to car.");
            return;
        }
        fuel += amount;
    }

    public String getBrand() {
        return this.brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", fuel=" + fuel +
                ", speed=" + speed +
                ", engine=" + engine +
                ", isLaunched=" + isLaunched +
                '}';
    }

}
