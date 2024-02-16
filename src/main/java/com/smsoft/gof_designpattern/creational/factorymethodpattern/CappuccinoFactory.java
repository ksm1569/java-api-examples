package com.smsoft.gof_designpattern.creational.factorymethodpattern;

// ConcreteCreator
public class CappuccinoFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}
