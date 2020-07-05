package com.company;
import com.company.Sports;
import com.company.Heavy;
import com.company.Normal;
import com.company.Vehicle;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Sports sp = new Sports(1, 2, 5, true);
        sp = new Sports(2, 3, 6, false);
        sp = new Sports(3, 4, 7, true);

        Normal nm = new Normal(4,"Oil", 8,9);
        nm = new Normal(5,"Diesel", 9,8);
        nm = new Normal(6,"Diesel", 10,8);
        nm = new Normal(7,"Gas", 1,5);

        Heavy hv = new Heavy(8, 2, 7, 100);
        hv = new Heavy(9, 1, 8, 200);
        hv = new Heavy(10, 20, 7, 150);

        Vehicle.showVehicle();
        Vehicle.showVisitorCount();

        System.out.println("\n\n");

        Vehicle.removeVehicle(6);
        Vehicle.showVehicle();
    }
}
