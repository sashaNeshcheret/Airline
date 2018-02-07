package com.sasha.entity;

public abstract class CargoPlane extends Aircraft {
    public CargoPlane(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }

    public CargoPlane() {
    }
}
