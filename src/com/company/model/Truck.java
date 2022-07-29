package com.company.model;

public class Truck extends PetrolCar {

    private int maxWeight;

    public Truck(String model, int maxSpeed, double price, String registrationNumber, double engineVolume, double fuelConsumption, int maxWeight) {
        super(model, maxSpeed, price, registrationNumber, engineVolume, fuelConsumption);
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck {" +
                " model = " + super.getModel() +
                ", maxSpeed = " + super.getMaxSpeed() + " km/h" +
                ", price = " + super.getPrice() + "$" +
                ", fuelConsumption = " + super.getFuelConsumption() + " l/km" +
                ", engineVolume = " + super.getEngineVolume() + "l" +
                ", maxWeight = " + maxWeight + " kg" +
                ", registrationNumber = " + super.getRegistrationNumber() +
                " }";
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
