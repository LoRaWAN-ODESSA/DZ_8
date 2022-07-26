package com.company;

public class PrintInfo {

    public void printByConsumption(CarDepot carDepot) {
        Car[] cars = carDepot.sortCars(carDepot.getCars());
        System.out.println("Info about cars in the car depot sorted by fuel consumption:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i].toString());
        }
        System.out.println();
    }

    public void printTotalPrice(CarDepot carDepot) {
        System.out.println("The total price of car depot is: " + carDepot.getTotalPrice() + "$");
        System.out.println();
    }

    public void printBySpeed(CarDepot carDepot, int min, int max) {
        Car[] cars = carDepot.searchBySpeed(min, max);
        if (cars.length == 0) {
            System.out.println("We didn't find the car according to the given parameters!");
        } else {
            System.out.println("We have found " + cars.length + " cars with speed between " + min + " km/h and " + max + " km/h:");
            for (int i = 0; i < cars.length; i++) {
                System.out.println((i + 1) + ". " + cars[i].toString());
            }
        }
        System.out.println();
    }
}
