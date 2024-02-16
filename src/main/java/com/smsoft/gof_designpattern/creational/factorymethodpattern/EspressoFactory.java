package com.smsoft.gof_designpattern.creational.factorymethodpattern;

// ConcreteCreator
public class EspressoFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}
