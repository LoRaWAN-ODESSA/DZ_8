package com.company.model;

public class PassengerCar extends PetrolCar {

    private String color;
    private String transmission;

    public PassengerCar(String model, int maxSpeed, double price, String registrationNumber,
                        double engineVolume, double fuelConsumption, String color, String transmission) {
        super(model, maxSpeed, price, registrationNumber, engineVolume, fuelConsumption);
        this.transmission = transmission;
        this.color = color;
    }

    @Override
    public String toString() {
        return "PassengerCar {" +
                " model = " + super.getModel() +
                ", maxSpeed=" + super.getMaxSpeed() + " km/h" +
                ", price = " + super.getPrice() + "$" +
                ", fuelConsumption = " + super.getFuelConsumption() + " l/km" +
                ", transmission = " + transmission +
                ", engineVolume = " + super.getEngineVolume() + "l" +
                ", color = " + color +
                ", registrationNumber = " + super.getRegistrationNumber() +
                " }";
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }
}
