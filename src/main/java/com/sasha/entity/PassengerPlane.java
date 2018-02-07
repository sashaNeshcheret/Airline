package com.sasha.entity;

public abstract class PassengerPlane extends  Aircraft {
    public PassengerPlane(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }

    public PassengerPlane() {
    }


}
