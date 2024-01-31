package com.smsoft.gof_designpattern.builderpattern;

// Builder 인터페이스
public interface CoffeeBuilder {
    CoffeeBuilder coffeeType(String type);
    CoffeeBuilder milk(boolean milk);
    CoffeeBuilder sugar(boolean sugar);
    Coffee build();
}