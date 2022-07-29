package com.company.model;

public abstract class Car {

    private String model;
    private int maxSpeed;
    private double price;
    private String registrationNumber;

    private double fuelConsumption;

    public Car(String model, int maxSpeed, double price, String registrationNumber) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
