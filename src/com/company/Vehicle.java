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

    static void removeVehicle(int modelNumber) {
        for(int i=0; i<allVehicle.size(); i++) {
            Vehicle v = allVehicle.get(i);
            if(v.modelNumber == modelNumber) {
                allVehicle.remove(i);
                break;
            }
        }
    }

    static void showVehicle() {
        for(Vehicle v : allVehicle) {
            System.out.println(v.vehicleType + " " + v.modelNumber + " " + v.engineType);
            if(v.vehicleType.equals("Sports")) {
                Sports sp = (Sports) v;
                System.out.println(sp.turbo);
            }
            if(v.vehicleType.equals("Heavy")) {
                Heavy hv = (Heavy) v;
                System.out.println(hv.weight);
            }
        }
    }

    static void showVisitorCount() {
        System.out.println("Total Number of Visitors: " + visitorsCount);
    }
}
