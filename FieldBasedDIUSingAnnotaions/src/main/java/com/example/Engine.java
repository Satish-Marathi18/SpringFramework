package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    @Value("V8 Engine")
    private String type;

    public String toString() {
        return type;
    }
}
