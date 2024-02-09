package com.smsoft.gof_designpattern.factorymethodpattern;

// Creator
public interface CoffeeFactory {

    // 핵심
    Coffee createCoffee();

    default Coffee orderCoffee() {
        Coffee coffee = createCoffee();
        coffee.brew();
        coffee.serve();
        return coffee;
    }
}
