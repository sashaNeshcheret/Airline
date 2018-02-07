package com.sasha.entity;

public class McDonnellDouglas_83 extends PassengerPlane{
    public McDonnellDouglas_83(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public McDonnellDouglas_83() {
        super("McDonnell Douglas 83",172, 4600, 3400, 811, 12300);
    }
}
