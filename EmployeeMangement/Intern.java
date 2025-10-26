package com.farhadislam.Knapsack.EmployeeMangementApplication;

public class Intern extends Employee{
    private double durationInMonths;


    public Intern(String id, String name, double salary, double durationInMonths) {
        super(id, name, salary);
        this.durationInMonths = durationInMonths;
    }

    public double getDurationInMonths() {return durationInMonths;}
    public void setDurationInMonths(double durationInMonths) {this.durationInMonths = durationInMonths;}

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Duration in months: " + durationInMonths);
        System.out.println("--------------------------------------");
    }
}
