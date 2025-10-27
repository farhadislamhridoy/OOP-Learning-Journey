package com.farhadislam.Knapsack.HotelBookingSystem;

public class SuiteRoom extends Room {
    private double livingAreaSize;


    public SuiteRoom(int roomNumber,double pricePerNight, double livingAreaSize) {
        super(roomNumber, "Suite", pricePerNight);
        this.livingAreaSize = pricePerNight;
    }

    public double getLivingAreaSize() {
        return livingAreaSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Living Area Size: " + livingAreaSize + " sqm");
        System.out.println("---------------------------------------");
    }
}
