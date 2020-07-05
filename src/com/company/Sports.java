package com.company;

public class Sports extends Vehicle{
    protected boolean turbo;

    Sports(int modelNumber, int enginePower, int tireSize, boolean turbo) {
        super("Sports", modelNumber, "Oil", enginePower, tireSize);
        this.turbo = turbo;
        addVehicle(this);
    }

    @Override
    void addVehicle(Vehicle newVehicle) {
        Vehicle.allVehicle.add(newVehicle);
    }
}
