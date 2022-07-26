package com.company;

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
                " model = " + model +
                ", maxSpeed=" + maxSpeed + " km/h" +
                ", price = " + price + "$" +
                ", fuelConsumption = " + fuelConsumption + " l/km" +
                ", transmission = " + transmission +
                ", engineVolume = " + engineVolume + "l" +
                ", color = " + color +
                ", registrationNumber = " + registrationNumber +
                " }";
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }
}
