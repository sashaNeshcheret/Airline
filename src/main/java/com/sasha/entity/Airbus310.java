package com.sasha.entity;

public class Airbus310 extends PassengerPlane{
    public Airbus310(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name,capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public Airbus310() {
        super("Airbus 310",270, 9170, 5008, 860, 11500);
    }
}
