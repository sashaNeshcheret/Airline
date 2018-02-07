package com.sasha.entity;

public class Fokker_50 extends PassengerPlane{
    public Fokker_50(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public Fokker_50() {
        super("Fokker 50",58, 1120, 800, 550, 7620);
    }
}
