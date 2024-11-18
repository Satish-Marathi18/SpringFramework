package com.example;

public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void displayDetails() {
        System.out.println("Car has "+engine);
    }
}
