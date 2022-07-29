package com.company;

import com.company.model.Car;
import com.company.model.ElectricCar;
import com.company.model.PassengerCar;
import com.company.model.Truck;
import com.company.service.CarCarDepotService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarCarDepotServiceTest {

    @Test
    void whenSortByFuelConsumption_thenReturnSortedList() {
        PassengerCar passengerCar1 = new PassengerCar("Audi A6", 220, 40000, "AC2821HA", 3.0, 15, "Black", "automatic");
        PassengerCar passengerCar2 = new PassengerCar("Fiat Croma", 210, 6000, "BH4717AB", 1.9, 10, "Green", "automatic");
        Truck truck1 = new Truck("Volvo FM 11", 180, 26000, "AA4354CE", 6.2, 25, 18600);
        Truck truck2 = new Truck("Volvo FM 15", 200, 34500, "BH3343AA", 7.5, 27, 20300);
        ElectricCar electricCar1 = new ElectricCar("Tesla Model S", 350, 75000, "AB2233BK", 400);
        ElectricCar electricCar2 = new ElectricCar("Tesla Model 3", 300, 35000, "AA2234BH", 350);

        Car[] inputList = {electricCar1, passengerCar1, passengerCar2, electricCar2, truck1, truck2};
        CarCarDepotService test = new CarCarDepotService(inputList);

        Car[] cars = test.sortCars(inputList);
        boolean result = true;
        for (int i = 0; i < cars.length - 1; i++) {
            if (cars[i].getClass() == PassengerCar.class || cars[i].getClass() == Truck.class) {
                if (cars[i + 1].getClass() == PassengerCar.class || cars[i + 1].getClass() == Truck.class) {
                    if (cars[i].getFuelConsumption() < cars[i + 1].getFuelConsumption()) {
                        result = false;
                        break;
                    }
                }
            }
        }
        Assertions.assertTrue(result);
    }

    @Test
    void whenCalculateTotalPrice_thenReturnTotalPrice() {
        PassengerCar passengerCar1 = new PassengerCar("Audi A6", 220, 40000, "AC2821HA", 3.0, 15, "Black", "automatic");
        PassengerCar passengerCar2 = new PassengerCar("Fiat Croma", 210, 6000, "BH4717AB", 1.9, 10, "Green", "automatic");
        Truck truck1 = new Truck("Volvo FM 11", 180, 26000, "AA4354CE", 6.2, 25, 18600);
        Truck truck2 = new Truck("Volvo FM 15", 200, 34500, "BH3343AA", 7.5, 27, 20300);
        ElectricCar electricCar1 = new ElectricCar("Tesla Model S", 350, 75000, "AB2233BK", 400);
        ElectricCar electricCar2 = new ElectricCar("Tesla Model 3", 300, 35000, "AA2234BH", 350);

        Car[] inputList = {electricCar1, passengerCar1, passengerCar2, electricCar2, truck1, truck2};
        CarCarDepotService test = new CarCarDepotService(inputList);

        double expectations = 216500.0;

        Assertions.assertEquals(expectations, test.getTotalPrice());
    }

    @Test
    void whenSearchBySpeed_thenReturnList() {
        PassengerCar passengerCar1 = new PassengerCar("Audi A6", 220, 40000, "AC2821HA", 3.0, 15, "Black", "automatic");
        PassengerCar passengerCar2 = new PassengerCar("Fiat Croma", 210, 6000, "BH4717AB", 1.9, 10, "Green", "automatic");
        Truck truck1 = new Truck("Volvo FM 11", 180, 26000, "AA4354CE", 6.2, 25, 18600);
        Truck truck2 = new Truck("Volvo FM 15", 200, 34500, "BH3343AA", 7.5, 27, 20300);
        ElectricCar electricCar1 = new ElectricCar("Tesla Model S", 350, 75000, "AB2233BK", 400);
        ElectricCar electricCar2 = new ElectricCar("Tesla Model 3", 300, 35000, "AA2234BH", 350);

        Car[] inputList = {electricCar1, passengerCar1, passengerCar2, electricCar2, truck1, truck2};
        CarCarDepotService test = new CarCarDepotService(inputList);
        int minSpeed = 200;
        int maxSpeed = 300;
        Car[] cars = test.searchBySpeed(minSpeed, maxSpeed);

        boolean resultByList = true;
        int resultByCount = 4;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getMaxSpeed() < minSpeed || cars[i].getMaxSpeed() > maxSpeed) {
                resultByList = false;
                break;
            }
        }
        Assertions.assertTrue(resultByList);
        Assertions.assertEquals(resultByCount, cars.length);
    }
}