package com.sasha.entity;

public class Ilyushin_76 extends CargoPlane {
    public Ilyushin_76(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public Ilyushin_76() {
        super("Ilyushin 76",60000, 4200, 8262, 850, 10200);
    }
}
