package com.company;

public class MountainBicycle extends Bicycle{
    private final int seatHeight;

    public MountainBicycle(String color, int seatHeight) {
        super(color);
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return "MountainBicycle{" + super.toString() + 
                "seatHeight=" + seatHeight +
                '}';
    }
}
