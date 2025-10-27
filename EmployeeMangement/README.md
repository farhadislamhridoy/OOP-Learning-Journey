# Java Employee Management System

A simple, console-based application for managing and displaying details of various employee types within an organization, built with Java.

This project serves as a practical demonstration of **Object-Oriented Programming (OOP)**, specifically focusing on **Inheritance**, **Polymorphism**, and **Encapsulation**.

---

## Key Features & OOP Concepts

### 1. Inheritance
* **Base Class:** The **`Employee`** class acts as the **parent class**, defining common properties for all employees, including `Id`, `name`, and `salary`.
* **Subclasses:** **`Manager`**, **`Developer`**, and **`Intern`** all **extend** the `Employee` class, inheriting these common properties while introducing specialized attributes and behaviors:
    * **`Manager`** adds `teamSize`.
    * **`Developer`** adds `programmingLanguage`.
    * **`Intern`** adds `durationInMonths`.

### 2. Polymorphism
* **Method Overriding:** The **`displayInfo()`** method is **overridden** in all subclasses (`Manager`, `Developer`, and `Intern`) to provide specific, dynamic information tailored to that employee type. This ensures that the base employee details are displayed *along with* the unique attributes of the specialized role.
* **Dynamic Method Invocation:** In the `EmployeeManagementSystem` class, a single loop iterates over an `ArrayList<Employee>`. When `e.displayInfo()` is called, the Java Runtime Environment dynamically executes the correct, overridden version of the method based on the actual object type (Manager, Developer, or Intern), perfectly demonstrating polymorphism.

### 3. Encapsulation
* **Data Hiding:** All class fields (e.g., `Id`, `name`, `salary`, `teamSize`, `programmingLanguage`) are declared as `private`.
* **Controlled Access:** Public `getter` and `setter` methods are provided for each field, allowing controlled and validated read/write access to the private data, thus protecting the object's internal state from direct, unintended modification.

---

## Project Structure

The system is organized using a hierarchical class structure:

* **`Employee.java`**: The **parent class** that defines the blueprint for all employees, providing the core properties and a default `displayInfo()` method.
* **`Manager.java`**: Extends `Employee`, adding `teamSize` and overriding `displayInfo()` to include manager-specific details.
* **`Developer.java`**: Extends `Employee`, adding `programmingLanguage` and overriding `displayInfo()` to include developer-specific details.
* **`Intern.java`**: Extends `Employee`, adding `durationInMonths` and overriding `displayInfo()` to include intern-specific details.
* **`EmployeeManagementSystem.java`**: The main class responsible for instantiating different specialized employee objects and showcasing **polymorphism** by managing them as a collection of the base `Employee` type.

---

### Example Output

The program creates instances of each employee type and displays their full details:

```text
Employee Id: M101
Employee Name: Chotu
Employee Salary: 100000.0
Team Size: 5
--------------------------------------
Employee Id: M102
Employee Name: Tanzim
Employee Salary: 200000.0
Team Size: 4
--------------------------------------
Employee Id: P101
Employee Name: Farhad Islam
Employee Salary: 900000.0
Programming Language: C, C++, Java, Python Basics
--------------------------------------
Employee Id: P102
Employee Name: Joya
Employee Salary: 50000.0
Programming Language: C, C++, Java
--------------------------------------
Employee Id: I101
Employee Name: Irfan
Employee Salary: 30000.0
Duration in months: 1.5
--------------------------------------
