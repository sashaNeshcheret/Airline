package com.sasha.entity;

public class Boeing_747_400 extends PassengerPlane{
    public Boeing_747_400(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public Boeing_747_400() {
        super("Boeing 747 400",168, 13430, 5000, 830, 13750);
    }
}
