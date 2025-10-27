Hotel Room Booking System
A simple, console-based application for managing different types of rooms in a hotel built with Java.

This project provides a clear example of Object-Oriented Programming (OOP), specifically focusing on Inheritance and Polymorphism.

Key Features & OOP Concepts
1. Inheritance
Base Class: The Room class acts as the parent class, defining common properties for all hotel rooms, including roomNumber, roomType, pricePerNight, and the isBooked status.

Subclasses: DeluxeRoom and SuiteRoom extend the Room class, inheriting these common properties while adding room-specific attributes and logic.

DeluxeRoom adds a freeBreakfast boolean attribute.

SuiteRoom adds a livingAreaSize double attribute.

2. Polymorphism
Method Overriding: The displayDetails() method is overridden in both subclasses to provide specific, dynamic implementations based on the room type:

DeluxeRoom: Adds the status of the Free Breakfast to the details.

SuiteRoom: Adds the Living Area Size to the details.

Runtime Behavior: In the Main class, a list of the base Room type is created. When the program iterates through this list and calls r.displayDetails(), the correct overridden method for DeluxeRoom or SuiteRoom is executed at runtime.

3. Encapsulation
Data Hiding: All attributes in the Room, DeluxeRoom, and SuiteRoom classes (e.g., roomNumber, pricePerNight, freeBreakfast) are declared as private, restricting direct external access.

Controlled Access: Public methods (like getRoomNumber(), getPricePerNight(), bookRoom(), and vacateRoom()) are provided for controlled access and modification of the room data. This ensures the internal state of the objects remains consistent.

Project Structure
The system is organized using a hierarchical class structure within the package com.farhadislam.Knapsack.HotelBookingSystem:

Room.java: The parent class that defines the blueprint for all hotel rooms and provides default methods for booking, vacating, and displaying details.

DeluxeRoom.java: Extends Room, adding the freeBreakfast boolean and overriding displayDetails() for deluxe-specific information.

SuiteRoom.java: Extends Room, adding the livingAreaSize double and overriding displayDetails() for suite-specific information.

Main.java: The main class responsible for creating specialized room objects (DeluxeRoom and SuiteRoom) and demonstrating polymorphism by calling the overridden methods on the base Room type.

Example Output

When running the Main.java file, you would see an output similar to this:

Hotel Room Details: 
Room Number: 101
Room Type: Deluxe
Price per Night: 1500.0
Booked: No
Free Breakfast: Included
---------------------------------------
Room Number: 102
Room Type: Deluxe
Price per Night: 1500.0
Booked: No
Free Breakfast: Not included
---------------------------------------
Room Number: 103
Room Type: Deluxe
Price per Night: 1500.0
Booked: No
Free Breakfast: Included
---------------------------------------
Room Number: 301
Room Type: Suite
Price per Night: 2000.0
Booked: No
Living Area Size: 40.4 sqm
---------------------------------------
Room Number: 302
Room Type: Suite
Price per Night: 2000.0
Booked: No
Living Area Size: 50.4 sqm
---------------------------------------
Room 101 has been booked successfully!
Room 103 has been booked successfully!
Room 101 is already booked.
Room 101 is now vacated.

🏠 Updated Room Status:
Room Number: 101
Room Type: Deluxe
Price per Night: 1500.0
Booked: No
Free Breakfast: Included
---------------------------------------
Room Number: 102
Room Type: Deluxe
Price per Night: 1500.0
Booked: No
Free Breakfast: Not included
---------------------------------------
Room Number: 103
Room Type: Deluxe
Price per Night: 1500.0
Booked: Yes
Free Breakfast: Included
---------------------------------------
Room Number: 301
Room Type: Suite
Price per Night: 2000.0
Booked: No
Living Area Size: 40.4 sqm
---------------------------------------
Room Number: 302
Room Type: Suite
Price per Night: 2000.0
Booked: No
Living Area Size: 50.4 sqm
---------------------------------------
