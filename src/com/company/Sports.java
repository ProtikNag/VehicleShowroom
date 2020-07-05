package com.company;

public class Sports extends Vehicle{
    protected boolean turbo;

    Sports(int modelNumber, int enginePower, int tireSize, boolean turbo) {
        super("Sports", modelNumber, "Oil", enginePower, tireSize);
        this.turbo = turbo;
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
