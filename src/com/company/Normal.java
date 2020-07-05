package com.company;

public class Normal extends Vehicle {
    Normal(int modelNumber, String engineType, int enginePower, int tireSize) {
        super("Normal", modelNumber, engineType, enginePower, tireSize);
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
