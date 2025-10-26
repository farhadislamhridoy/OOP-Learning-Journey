package com.farhadislam.Knapsack.EmployeeMangementApplication;


import java.util.ArrayList;

public class EmployeeManagementSystem {
    static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Manager("M101", "Chotu", 100000, 5));
        employees.add(new Manager("M102", "Tanzim", 200000, 4));
        employees.add(new Developer("P101", "Farhad Islam", 900000, "C, C++, Java, Python Basics"));
        employees.add(new Developer("P102", "Joya", 50000, "C, C++, Java"));
        employees.add(new Intern("I101", "Irfan", 30000, 1.5));

        for(Employee e: employees){
            e.displayInfo();
        }
    }
}
