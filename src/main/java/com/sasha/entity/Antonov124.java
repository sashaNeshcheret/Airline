package com.sasha.entity;

public class Antonov124 extends CargoPlane {
    public Antonov124(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public Antonov124() {
        super("Аntonov 124",120000, 4800, 12600, 800, 11600);
    }
}
