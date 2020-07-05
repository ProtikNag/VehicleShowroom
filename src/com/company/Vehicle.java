package com.company;

import java.util.ArrayList;

public abstract class Vehicle {
    protected int modelNumber, enginePower, tireSize;
    protected String engineType, vehicleType;
    protected static ArrayList<Vehicle> allVehicle = new ArrayList<Vehicle>();
    protected static int visitorsCount = 30;

    Vehicle(String vehicleType, int modelNumber, String engineType, int enginePower, int tireSize){
        this.vehicleType = vehicleType;
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.tireSize = tireSize;

        if(vehicleType == "Sports")
            visitorsCount += 20;
    }

    abstract void addVehicle(Vehicle newVehicle);

    abstract void removeVehicle(int model_number);

    static void showVehicle() {
        for(Vehicle v : allVehicle) {
            System.out.println(v.vehicleType + " " + v.modelNumber + " " + v.engineType);
        }
    }

    static void showVisitorCount() {
        System.out.println("Total Number of Visitors: " + visitorsCount);
    }
}
