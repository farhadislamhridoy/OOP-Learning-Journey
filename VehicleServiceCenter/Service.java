package com.farhadislam.Knapsack.VehicleServiceCenter;

public abstract class Service {
    private String serviceName;
    private String vehicleNumber;
    private double baseCharge;

    public Service(String serviceName, String vehicleNumber, double baseCharge) {
        this.serviceName = serviceName;
        this.vehicleNumber = vehicleNumber;
        this.baseCharge = baseCharge;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public double getBaseCharge() {
        return baseCharge;
    }

    public void setBaseCharge(double baseCharge) {
        this.baseCharge = baseCharge;
    }

    public String getDetails(){
        return "Service Name: " +serviceName + " | Vehicle Number: " + vehicleNumber;
    }

    public double calculateBill() {
        return baseCharge;
    }
}
