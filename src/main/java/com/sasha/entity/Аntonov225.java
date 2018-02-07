package com.sasha.entity;

public class Аntonov225 extends CargoPlane {
    public Аntonov225(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        super(name, capacity, flightRange, fuelConsumption, speed, flightHeight);
    }
    public Аntonov225() {
        super("Аntonov 225",250000, 15400, 15900, 850, 11800);
    }
}
