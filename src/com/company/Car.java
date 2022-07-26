package com.company;

public abstract class Car {

    String model;
    int maxSpeed;
    double price;
    String registrationNumber;

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

    public abstract double getFuelConsumption();
}
