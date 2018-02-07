package com.sasha.entity;

public class Airbus320 extends PassengerPlane{
    public Airbus320(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public Airbus320() {
        super("Airbus320",170, 6150 , 220, 860, 10300);
    }
}
