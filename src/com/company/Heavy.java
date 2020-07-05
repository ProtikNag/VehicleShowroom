package com.company;

public class Heavy extends Vehicle{
    protected int weight;

    Heavy(int modelNumber, int enginePower, int tireSize, int weight) {
        super("Heavy", modelNumber, "Diesel", enginePower, tireSize);
        this.weight = weight;
        addVehicle(this);
    }

    @Override
    void addVehicle(Vehicle newVehicle) {
        Vehicle.allVehicle.add(newVehicle);
    }

    @Override
    void removeVehicle(int model_number) {

    }
}
