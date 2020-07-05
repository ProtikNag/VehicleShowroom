package com.company;

public abstract class Vehicle {
    protected int modelNumber, enginePower, tireSize;
    protected String engineType, vehicleType;
    protected static Vehicle allVehicle[] = new Vehicle[100000];
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

    abstract void addVehicle(int model_number, String engine_type, int engine_power, int tire_size);

    abstract void removeVehicle(int model_number);

    abstract void showVehicle();

    abstract void showVisitorCount();
}
