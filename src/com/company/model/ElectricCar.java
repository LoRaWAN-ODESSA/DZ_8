package com.company.model;

public class ElectricCar extends Car {

    private int maxDistance;

    public ElectricCar(String model, int maxSpeed, double price, String registrationNumber, int maxDistance) {
        super(model, maxSpeed, price, registrationNumber);
        super.setFuelConsumption(0.0);
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return "ElectricCar {" +
                " model = " + super.getModel() +
                ", maxSpeed = " + super.getMaxSpeed() + " km/h" +
                ", price = " + super.getPrice() + "$" +
                ", maxDistance = " + maxDistance + " km" +
                ", registrationNumber = " + super.getRegistrationNumber() +
                " }";
    }

    public int getMaxDistance() {
        return maxDistance;
    }
}
