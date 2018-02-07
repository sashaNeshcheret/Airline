package com.sasha.entity;

public class Boeing_737_500 extends PassengerPlane{
    public Boeing_737_500(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }

    public Boeing_737_500() {
        super("Boeing 737 500",132, 3400, 3000, 795, 12400);
    }
}
