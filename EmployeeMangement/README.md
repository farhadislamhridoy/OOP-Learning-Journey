## Project Structure

The system is organized using a hierarchical class structure:
* `Employee.java`: The base class containing common fields (`id`, `name`, `salary`) and a `displayInfo()` method.
* `Manager.java`: Extends `Employee`, adding the `teamSize` field.
* `Developer.java`: Extends `Employee`, adding the `programmingLanguage` field.
* `Intern.java`: Extends `Employee`, adding the `durationInMonths` field.
* `EmployeeManagementSystem.java`: The main class responsible for creating employee objects, adding them to an `ArrayList`, and demonstrating the use of polymorphism by calling `displayInfo()` for each object.
