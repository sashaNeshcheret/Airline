package com.sasha.entity;

public class Boeing_727_200 extends PassengerPlane{
    public Boeing_727_200(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public Boeing_727_200() {
        super("Boeing 727 200",198, 4020, 5018, 965, 12192);
    }
}
