# Java Library Management System

A simple, console-based application for calculating the borrowing cost of books in a library, built with Java.

This project demonstrates core **Object-Oriented Programming (OOP)** concepts, primarily **Inheritance** and **Polymorphism**.

---

## Key Features & OOP Concepts

### 1. Inheritance
* **Base Class:** The **`Book`** class acts as the **parent class**, defining common properties for all book types, including `title`, `author`, and `price`.
* **Subclasses:** **`Ebook`** and **`PrintedBook`** **extend** the `Book` class, inheriting these common properties while adding specific attributes:
    * **`Ebook`** adds `fileSize`.
    * **`PrintedBook`** adds `pageCount`.

### 2. Polymorphism
* **Method Overriding:** Both the **`getDetails()`** and **`calculatePrice(int days)`** methods are **overridden** in the subclasses to provide specific, dynamic implementations based on the book format:
    * **`Ebook`:** Overrides `calculatePrice` to apply a **10% discount** on the base borrowing cost.
    * **`PrintedBook`:** Overrides `calculatePrice` to add a **\$2.0 handling fee** to the base borrowing cost.
* **Dynamic Method Invocation:** In the `LibraryManagement` class, the overridden methods are called on the base **`Book`** type objects (e.g., `ebook.calculatePrice(days)`), showcasing polymorphism in action.

### 3. Encapsulation
* **Data Hiding:** All class fields (`title`, `author`, `price`, `fileSize`, `pageCount`) are declared as `private`.
* **Controlled Access:** Public `getter` and `setter` methods are provided to manage read and write access to the private data, maintaining control over the state of the objects.

---

## Project Structure

The system is organized using a hierarchical class structure:

* **`Book.java`**: The **parent class** that defines the blueprint for all books, providing common methods like `getDetails()` and a default `calculatePrice(int days)` implementation (which calculates the base cost).
* **`Ebook.java`**: Extends `Book`, adding the `fileSize` attribute and overriding methods to include ebook-specific details and cost calculations.
* **`PrintedBook.java`**: Extends `Book`, adding the `pageCount` attribute and overriding methods to include printed book-specific details and cost calculations (including the handling fee).
* **`LibraryManagement.java`**: The main class responsible for creating specialized book objects (an `Ebook` and a `PrintedBook`) and demonstrating **polymorphism** by calling the overridden methods on the base `Book` type references.

---

### Example Output

The program calculates and displays the borrowing cost for both an Ebook and a Printed Book for a 5-day period.

```text
EBook Details: Title: Java Basics, Author: John Doe, File Size: 5.5 MB
Total Borrowing Cost for 5 days: $9.0

PrintedBook Details: Title: OOP Concepts, Author: Jane Smith, Pages: 300
Total Borrowing Cost for 5 days: $14.5
