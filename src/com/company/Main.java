package com.company;

public class Main {
    public static void main(String[] args) {
        PassengerCar passengerCar1 = new PassengerCar("Audi A6", 220, 40000, "AC2821HA", 3.0, 15, "Black", "automatic");
        PassengerCar passengerCar2 = new PassengerCar("Fiat Croma", 210, 6000, "BH4717AB", 1.9, 10, "Green", "automatic");
        PassengerCar passengerCar3 = new PassengerCar("Bugatti Veyron", 407, 1700000, "AA7777AA", 8.0, 27, "White", "automatic");
        Truck truck1 = new Truck("Volvo FM 11", 180, 26000, "AA4354CE", 6.2, 25, 18600);
        Truck truck2 = new Truck("Volvo FM 15", 200, 34500, "BH3343AA", 7.5, 27, 20300);
        ElectricCar electricCar1 = new ElectricCar("Tesla Model S", 350, 75000, "AB2233BK", 400);
        ElectricCar electricCar2 = new ElectricCar("Tesla Model 3", 300, 35000, "AA2234BH", 350);

        Car[] cars = {electricCar1, passengerCar1, passengerCar2, electricCar2, truck1, truck2, passengerCar3};

        CarDepot carDepot = new CarDepot(cars);

        PrintInfo printInfo = new PrintInfo();
        printInfo.printByConsumption(carDepot);
        printInfo.printTotalPrice(carDepot);
        printInfo.printBySpeed(carDepot, 200, 300);
    }
}
