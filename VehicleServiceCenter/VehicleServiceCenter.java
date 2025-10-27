package com.farhadislam.Knapsack.VehicleServiceCenter;

import java.util.Scanner;

public class VehicleServiceCenter {
    static void main() {

            Service carService = new CarService("Super", "1012W10", 200, true);
            System.out.println(carService.getDetails());
            System.out.println("Service details: " + carService.calculateBill());

            Service bikeService = new  BikeService("Super", "43310", 200, true);
            System.out.println(bikeService.getDetails());
            System.out.println("Service details: " + bikeService.calculateBill());

    }
}
