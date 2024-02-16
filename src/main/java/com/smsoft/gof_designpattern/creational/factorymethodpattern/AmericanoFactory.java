package com.smsoft.gof_designpattern.creational.factorymethodpattern;

// ConcreteCreator
public class AmericanoFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}
