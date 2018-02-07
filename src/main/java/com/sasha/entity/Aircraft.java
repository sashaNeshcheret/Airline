package com.sasha.entity;

import java.math.BigDecimal;

public abstract class Aircraft {
    private String name;
    private int capacity;
    private int flightRange;
    private int fuelConsumption;
    private int speed;
    private int flightHeight;

    public Aircraft() {
    }

    public Aircraft(String name, int capacity, int flightRange, int fuelConsumption, int speed, int flightHeight) {
        this.name = name;
        this.capacity = capacity;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.flightHeight = flightHeight;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getFlightRange() {
        return flightRange;
    }
    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getFlightHeight() {
        return flightHeight;
    }
    public void setFlightHeight(int flightHeight) {
        this.flightHeight = flightHeight;
    }

    @Override
    public String toString() {
        return new String("Aircraft " + this.name + " has following characteristics: " +
                "capacity - " + capacity + ", " +
                "flight range - " + flightRange + " km, " +
                "fuel consumption - " + fuelConsumption + " liter/hour, " +
                "speed - " + speed + " km/hour, " +
                "flight height - " + flightHeight + " m." );
    }
}