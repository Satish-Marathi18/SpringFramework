package com.example;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String type = "V8 Engine";

    public String toString() {
        return type;
    }
}
