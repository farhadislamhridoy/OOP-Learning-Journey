package com.farhadislam.Knapsack.VehicleServiceCenter;

public class CarService extends Service {
    private boolean washIncluded = false;

    public CarService(String serviceName, String vehicleNumber, double baseCharge, boolean washIncluded) {
        super(serviceName, vehicleNumber, baseCharge);
        this.washIncluded = washIncluded;

    }

    @Override
    public String getDetails(){
        return super.getDetails() + " | Wash included: " + (washIncluded ? "YES" : "NO");
    }
    @Override
    public double calculateBill() {
        double total = super.calculateBill();
        if (washIncluded) {
            return total += 200;
        }else{
            return total;
        }
    }
}
