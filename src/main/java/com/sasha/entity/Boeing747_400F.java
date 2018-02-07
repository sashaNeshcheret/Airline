package com.sasha.entity;

public class Boeing747_400F extends CargoPlane {
    public Boeing747_400F(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public Boeing747_400F() {
        super("Boeing747 400F",112630, 8230, 13500, 900, 10700);
    }
}
