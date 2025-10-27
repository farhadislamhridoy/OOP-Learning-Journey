# Java Hotel Booking System Application

A simple, console-based system for managing hotel rooms built with Java.

This project provides a clear example of **Object-Oriented Programming (OOP)**, specifically focusing on **Inheritance**, **Polymorphism**, and **Encapsulation**.

## Key Features & OOP Concepts

### 1. Inheritance
* **Base Class:** The `Room` class acts as the **parent class**, defining common properties for all room types, including `roomNumber`, `roomType`, `pricePerNight`, and the basic operational methods like `bookRoom()` and `vacateRoom()`.
* **Subclasses:** `DeluxeRoom` and `SuiteRoom` **extend** the `Room` class, inheriting these common properties and behaviors while adding room-specific attributes and logic.

### 2. Polymorphism
* **Method Overriding:** The `displayDetails()` method is **overridden** in the subclasses (`DeluxeRoom` and `SuiteRoom`) to provide specific, dynamic implementations based on the room type:
    * **DeluxeRoom:** Adds details about whether `freeBreakfast` is included.
    * **SuiteRoom:** Adds details about the `livingAreaSize`.
* **Dynamic Dispatch:** The `Main.java` class demonstrates **polymorphism** by iterating over an `ArrayList` of the base `Room` type and calling `displayDetails()`, which executes the correct subclass implementation at runtime.

### 3. Encapsulation
* **Data Hiding:** All class attributes (e.g., `roomNumber`, `pricePerNight`, `isBooked`, `freeBreakfast`, `livingAreaSize`) are declared as **private**.
* **Controlled Access:** Public methods (Getters and Setters) are provided for controlled access to the attributes. For example, `getRoomNumber()` provides read access, and `setBooked()` controls the modification of the booking status.

---

## Project Structure

The system is organized using a hierarchical class structure:

* `Room.java`: The **parent class** that defines the blueprint for all hotel rooms and includes basic methods for booking, vacating, and displaying general details.
* `DeluxeRoom.java`: Extends `Room`, adding the `freeBreakfast` boolean attribute and overriding the `displayDetails()` method for Deluxe room-specific information.
* `SuiteRoom.java`: Extends `Room`, adding the `livingAreaSize` double attribute and overriding the `displayDetails()` method for Suite room-specific information.
* `Main.java`: The main execution class responsible for:
    * Creating and initializing an `ArrayList` of specialized room objects.
    * Demonstrating **polymorphism** by iterating over the list and calling the overridden `displayDetails()` method.
    * Showcasing the `bookRoom()` and `vacateRoom()` methods.

---

### Example Output
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
