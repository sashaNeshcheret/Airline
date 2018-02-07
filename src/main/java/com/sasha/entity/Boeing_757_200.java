package com.sasha.entity;

public class Boeing_757_200 extends PassengerPlane{
    public Boeing_757_200(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }

    public Boeing_757_200() {
        super("Boeing 757 200",224, 5550, 4200, 850, 12800);
    }
}
