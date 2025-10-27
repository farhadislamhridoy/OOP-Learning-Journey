# Java Hotel Booking System

A simple, console-based Hotel Booking System application built with Java.

This project provides a clear example of **Object-Oriented Programming (OOP)**, specifically focusing on **Inheritance**, **Polymorphism**, and **Encapsulation**.

---

## Key Features & OOP Concepts

### 1. Inheritance
* **Base Class:** The `Room` class acts as the **parent class**, defining common properties for all room types, including `roomNumber`, `roomType`, `pricePerNight`, and `isBooked`.
* **Subclasses:** `DeluxeRoom` and `SuiteRoom` **extend** the `Room` class, inheriting these common properties while adding room-specific attributes and logic.

### 2. Polymorphism
* **Method Overriding:** The `displayDetails()` method is **overridden** in the subclasses to provide specific, dynamic details based on the room type:
    * **`DeluxeRoom`:** Includes the status of `freeBreakfast`.
    * **`SuiteRoom`:** Includes the `livingAreaSize`.
* **Dynamic Method Invocation:** In the `Main` class, the overridden `displayDetails()`, `bookRoom()`, and `vacateRoom()` methods are called on the base `Room` type objects, demonstrating polymorphism.

### 3. Encapsulation
* **Data Hiding:** All class fields (e.g., `roomNumber`, `pricePerNight`, `isBooked`, `freeBreakfast`, `livingAreaSize`) are declared as `private`.
* **Controlled Access:** Public `getter` and `setter` methods (e.g., `getRoomNumber()`, `setPricePerNight()`, `isBooked()`) are provided to control read and write access to the private data, ensuring data integrity.
* **Behavioral Control:** Methods like `bookRoom()` and `vacateRoom()` encapsulate the state-changing logic, preventing direct, uncontrolled modification of the `isBooked` status.

---

## Project Structure

The system is organized using a hierarchical class structure:

* **`Room.java`**: The **parent class** that defines the blueprint for all hotel rooms and provides default implementations for booking, vacating, and displaying details.
* **`DeluxeRoom.java`**: Extends `Room`, adding the `freeBreakfast` boolean and overriding `displayDetails()` for Deluxe-specific information.
* **`SuiteRoom.java`**: Extends `Room`, adding the `livingAreaSize` double and overriding `displayDetails()` for Suite-specific information.
* **`Main.java`**: The main class responsible for creating specialized room objects (e.g., `DeluxeRoom` and `SuiteRoom`), adding them to an `ArrayList<Room>`, and demonstrating **polymorphism** by iterating and calling the overridden methods on the base `Room` type.

---

### Example Output

The program demonstrates initial display, booking a room, attempting to rebook an already booked room, vacating a room, and displaying the final updated status.

```text
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
Living Area Size: 2000.0 sqm
---------------------------------------
Room Number: 302
Room Type: Suite
Price per Night: 2000.0
Booked: No
Living Area Size: 2000.0 sqm
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
Living Area Size: 2000.0 sqm
---------------------------------------
Room Number: 302
Room Type: Suite
Price per Night: 2000.0
Booked: No
Living Area Size: 2000.0 sqm
---------------------------------------
