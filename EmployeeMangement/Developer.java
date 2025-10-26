package com.farhadislam.Knapsack.EmployeeMangementApplication;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {this.programmingLanguage = programmingLanguage;}
    public String getProgrammingLanguage() {return programmingLanguage;}


    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("--------------------------------------");
    }
}
