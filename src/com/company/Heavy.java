package com.company;

public class Heavy extends Vehicle{
    protected int weight;

    Heavy(int modelNumber, int enginePower, int tireSize, int weight) {
        super("Heavy", modelNumber, "Diesel", enginePower, tireSize);
        this.weight = weight;
    }

    @Override
    void addVehicle(int model_number, String engine_type, int engine_power, int tire_size) {

    }

    @Override
    void removeVehicle(int model_number) {

    }

    @Override
    void showVehicle() {

    }

    @Override
    void showVisitorCount() {

    }
}
