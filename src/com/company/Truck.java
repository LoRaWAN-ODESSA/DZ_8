package com.company;

public class Truck extends PetrolCar {

    private int maxWeight;

    public Truck(String model, int maxSpeed, double price, String registrationNumber, double engineVolume, double fuelConsumption, int maxWeight) {
        super(model, maxSpeed, price, registrationNumber, engineVolume, fuelConsumption);
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck {" +
                " model = " + model +
                ", maxSpeed = " + maxSpeed + " km/h" +
                ", price = " + price + "$" +
                ", fuelConsumption = " + fuelConsumption + " l/km" +
                ", engineVolume = " + engineVolume + "l" +
                ", maxWeight = " + maxWeight + " kg" +
                ", registrationNumber = " + registrationNumber +
                " }";
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
