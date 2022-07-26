package com.company;

public class ElectricCar extends Car {

    private int maxDistance;

    public ElectricCar(String model, int maxSpeed, double price, String registrationNumber, int maxDistance) {
        super(model, maxSpeed, price, registrationNumber);
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return "ElectricCar {" +
                " model = " + model +
                ", maxSpeed = " + maxSpeed + " km/h" +
                ", price = " + price + "$" +
                ", maxDistance = " + maxDistance + " km" +
                ", registrationNumber = " + registrationNumber +
                " }";
    }

    @Override
    public double getFuelConsumption() {
        return 0;
    }
}
