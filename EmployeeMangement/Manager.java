package com.farhadislam.Knapsack.EmployeeMangementApplication;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String id, String name, double salary,  int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }
    public void setTeamSize(int teamSize) {this.teamSize = teamSize;};
    public int getTeamSize() {return teamSize;}

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
        System.out.println("--------------------------------------");
    }
}
