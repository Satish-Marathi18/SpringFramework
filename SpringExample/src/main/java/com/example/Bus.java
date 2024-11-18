package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bus implements Vehicle {
    private String type = "KSRTC";

    public Bus() {

    }

    @Override
    public void drive() {
        System.out.println("Driving Bus ");
        System.out.println(type);
    }
}
