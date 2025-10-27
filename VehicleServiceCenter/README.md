# Java Vehicle Service Center Application

A simple, console-based billing system for a Vehicle Service Center built with Java. This project provides a clear example of **Object-Oriented Programming (OOP)**, specifically focusing on **Inheritance** and **Polymorphism**.

## Key Features & OOP Concepts

### 1. Inheritance
* **Base Class:** The `Service` class acts as the **parent class**, defining common properties for all services, including `serviceName`, `vehicleNumber`, and `baseCharge`.
* **Subclasses:** `CarService` and `BikeService` **extend** the `Service` class, inheriting these common properties while adding vehicle-specific attributes and logic.

### 2. Polymorphism
* **Method Overriding:** Both the `calculateBill()` and `getDetails()` methods are **overridden** in the subclasses to provide specific, dynamic implementations based on the vehicle type:
    * **CarService:** Conditionally adds a charge of 200 to the total bill if a wash is included.
    * **BikeService:** Conditionally adds a charge of 100 to the total bill if an oil change is requested.

## Project Structure

The system is organized using a hierarchical class structure:

* `Service.java`: The **parent class** that defines the blueprint for all vehicle services and provides a default `calculateBill()` implementation.
* `CarService.java`: Extends `Service`, adding the `washIncluded` boolean and overriding the methods for car-specific details and billing.
* `BikeService.java`: Extends `Service`, adding the `oilChange` boolean and overriding the methods for bike-specific details and billing.
* `VehicleServiceCenter.java`: The main class responsible for creating specialized service objects and demonstrating **polymorphism** by calling the overridden methods on the base `Service` type.

### Example Output

Service Name: Super | Vehicle Number: 1012W10 | Wash included: YES Service details: 400.0 Service 
Name: Super | Vehicle Number: 43310 | Oil change: YES Service details: 300.0
