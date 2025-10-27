package com.farhadislam.Knapsack.HotelBookingSystem;

public class DeluxeRoom extends Room {
    private boolean freeBreakfast;

    public DeluxeRoom(int roomNumber, double pricePerNight,boolean freeBreakFast) {
        super(roomNumber, "Deluxe", pricePerNight);
        this.freeBreakfast = freeBreakFast;
    }

   public boolean hasFreeBreakfast() {return freeBreakfast;};

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Free Breakfast: " + (freeBreakfast ? "Included" : "Not included"));
        System.out.println("---------------------------------------");
    }
}
