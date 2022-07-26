package com.company;

public abstract class PetrolCar extends Car {

    double engineVolume;
    double fuelConsumption;

    public PetrolCar(String model, int maxSpeed, double price, String registrationNumber, double engineVolume, double fuelConsumption) {
        super(model, maxSpeed, price, registrationNumber);
        this.engineVolume = engineVolume;
        this.fuelConsumption = fuelConsumption;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }


}
