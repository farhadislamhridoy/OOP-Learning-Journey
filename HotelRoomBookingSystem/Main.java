package com.farhadislam.Knapsack.HotelBookingSystem;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new DeluxeRoom(101, 1500, true));
        rooms.add(new DeluxeRoom(102, 1500, false));
        rooms.add(new DeluxeRoom(103, 1500, true));
        rooms.add(new SuiteRoom(301, 2000, 40.4));
        rooms.add(new SuiteRoom(302, 2000, 50.4));

        System.out.println("Hotel Room Details: ");
        for(Room r : rooms) {
            r.displayDetails();
        }

        rooms.get(0).bookRoom();
        rooms.get(2).bookRoom();

        // Trying to rebook same room
        rooms.get(0).bookRoom();

        // Vacate a room
        rooms.get(0).vacateRoom();

        // Final Status
        System.out.println("\n🏠 Updated Room Status:");
        for (Room r : rooms) {
            r.displayDetails();
        }


    }
}
