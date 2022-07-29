package com.company.view;

import com.company.model.Car;
import com.company.service.CarCarDepotService;

public class PrintInfo {

    public void printByConsumption(CarCarDepotService carDepotService) {
        Car[] cars = carDepotService.sortCars(carDepotService.getCars());
        System.out.println("Info about cars in the car depot sorted by fuel consumption:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i].toString());
        }
        System.out.println();
    }

    public void printTotalPrice(CarCarDepotService carDepotService) {
        System.out.println("The total price of car depot is: " + carDepotService.getTotalPrice() + "$");
        System.out.println();
    }

    public void printBySpeed(CarCarDepotService carDepotService, int min, int max) {
        Car[] cars = carDepotService.searchBySpeed(min, max);
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
