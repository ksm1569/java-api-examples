package com.smsoft.thisisjava.ch6class.ex04overloading;

public class Car01 {
    String company = "삼성자동차";
    String model;
    String color;
    int maxSpeed;

    Car01() {}

    Car01(String model) {
        this.model = model;
    }

    Car01(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car01(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
