package com.smsoft.ch6class.ex04overloading;

public class Car02 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car02(String model) {
        this(model, "회색", 300);
    }

    Car02(String model, String color) {
        this(model, color, 300);
    }

    Car02(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
