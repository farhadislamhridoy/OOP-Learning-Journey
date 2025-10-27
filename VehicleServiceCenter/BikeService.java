package com.farhadislam.Knapsack.VehicleServiceCenter;

public class BikeService extends Service{
    private boolean oilChange;

    public BikeService(String serviceName, String vehicleNumber, double baseCharge, boolean oilChange) {
        super(serviceName, vehicleNumber, baseCharge);
        this.oilChange = oilChange;
    }

    @Override
    public String getDetails() {

        return super.getDetails() + " | Oil change: " + (oilChange ? "YES" : "NO");
    }
    @Override
    public double calculateBill() {
        double total = super.calculateBill();
        if(oilChange){
            return total+=100;
        }else {
            return total;
        }
    }
}
