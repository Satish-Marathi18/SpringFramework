package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Controller {
    private final Vehicle vehicle;
    @Autowired
    public Controller(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

//    public void setVehicle(com.example.Car.Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }

    public void getDrive() {
        vehicle.drive();
        System.out.println("Driving Vehicle");
    }
}
