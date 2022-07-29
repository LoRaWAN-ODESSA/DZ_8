package com.company.service;

import com.company.model.Car;

public interface CarDepot {

    double getTotalPrice();

    Car[] sortCars(Car[] cars);

    Car[] searchBySpeed(int min, int max);

    void setCars(Car[] cars);
}
