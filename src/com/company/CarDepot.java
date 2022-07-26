package com.company;

public class CarDepot {

    private Car[] cars;
    private double totalPrice;

    public CarDepot(Car[] cars) {
        this.cars = cars;
        totalPrice = findTotalPrice();
    }

    private double findTotalPrice() {
        double result = 0.0;
        for (int i = 0; i < cars.length; i++) {
            result += cars[i].getPrice();
        }
        return result;
    }

    public Car[] sortCars(Car[] cars) {
        int currentNumber = 0;
        int fuelCarsCount = findFuelCarsCount(cars);
        Car[] sortedCars = findFuelCarsMinConsumption(cars);
        for (int i = 0; i < fuelCarsCount; i++) {
            for (int j = 0; j < cars.length; j++) {
                if (cars[j] != null) {
                    if (cars[j].getClass() == PassengerCar.class || cars[j].getClass() == Truck.class) {
                        if (sortedCars[i].getFuelConsumption() <= cars[j].getFuelConsumption()) {
                            sortedCars[i] = cars[j];
                            currentNumber = j;
                        }
                    }
                }
            }
            cars[currentNumber] = null;
        }
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                sortedCars[fuelCarsCount] = cars[i];
                fuelCarsCount++;
            }
        }
        return sortedCars;
    }

    public Car[] searchBySpeed(int min, int max) {
        Car[] cars = getCars();
        Car[] result = new Car[]{};
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].maxSpeed >= min && cars[i].maxSpeed <= max) {
                Car[] temp = new Car[result.length + 1];
                if (result.length == 0) {
                    result = new Car[temp.length];
                    result[0] = cars[i];
                } else {
                    for (int j = 0; j < result.length; j++) {
                        temp[j] = result[j];
                    }
                    temp[result.length] = cars[i];
                    result = new Car[temp.length];
                    for (int j = 0; j < temp.length; j++) {
                        result[j] = temp[j];
                    }
                }
            }
        }
        return result;
    }

    private Car[] findFuelCarsMinConsumption(Car[] cars) {
        Car[] result = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            result[i] = cars[i];
        }
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getClass() == PassengerCar.class || cars[i].getClass() == Truck.class) {
                if (result[i].getFuelConsumption() >= cars[i].getFuelConsumption()) {
                    result[i] = cars[i];
                    break;
                }
            }
        }
        for (int i = 1; i < result.length; i++) {
            result[i] = result[0];
        }
        return result;
    }

    private int findFuelCarsCount(Car[] cars) {
        int result = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getClass() == PassengerCar.class || cars[i].getClass() == Truck.class) {
                result++;
            }
        }
        return result;
    }

    public Car[] getCars() {
        Car[] result = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            result[i] = cars[i];
        }
        return result;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
}
