package com.farhadislam.Knapsack.EmployeeMangementApplication;

public class Employee {
    private String Id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.Id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(String Id) {this.Id = Id;}
    public void setName(String Name){this.name = name;};
    public void setSalary(double salary){this.salary = salary;};


    public String getId() {return Id;}
    public String getName() {return name;}
    public double  getSalary() {return salary;}

    public void displayInfo(){
        System.out.println("Employee Id: " + this.Id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }
}
