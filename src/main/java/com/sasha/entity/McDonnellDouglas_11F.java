package com.sasha.entity;

public class McDonnellDouglas_11F extends CargoPlane {
    public McDonnellDouglas_11F(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public McDonnellDouglas_11F() {
        super("McDonnell Douglas 11F",72630, 4400, 7500, 876, 12600);
    }
}
