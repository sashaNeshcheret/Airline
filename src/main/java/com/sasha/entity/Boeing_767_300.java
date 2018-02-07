package com.sasha.entity;

public class Boeing_767_300 extends PassengerPlane{
    public Boeing_767_300(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }

    public Boeing_767_300() {
        super("Boeing 767 300",328, 4500, 4500, 850, 13100);
    }
}
