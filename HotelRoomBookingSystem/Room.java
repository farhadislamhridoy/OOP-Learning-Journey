package com.farhadislam.Knapsack.HotelBookingSystem;

public class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isBooked;

    public Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " has been booked successfully!");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public void vacateRoom() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Room " + roomNumber + " is now vacated.");
        } else {
            System.out.println("Room " + roomNumber + " is already vacant.");
        }


    }

    public void displayDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price per Night: " + pricePerNight);
        System.out.println("Booked: " + (isBooked ? "Yes" : "No"));
    }

}
