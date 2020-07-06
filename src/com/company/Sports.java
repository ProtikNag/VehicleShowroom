package com.company;

public class Sports extends Vehicle{
    boolean turbo;

    Sports(int modelNumber, int enginePower, int tireSize, boolean turbo) {
        super("Sports", modelNumber, "Oil", enginePower, tireSize);
        this.turbo = turbo;
        addVehicle(this);
    }

    void addVehicle(Vehicle newVehicle) {
        Vehicle.allVehicle.add(newVehicle);
    }
}
