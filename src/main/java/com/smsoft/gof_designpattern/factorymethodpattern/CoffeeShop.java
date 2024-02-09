package com.smsoft.gof_designpattern.factorymethodpattern;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.orderCoffee();

        CoffeeFactory americanoFactory = new AmericanoFactory();
        Coffee americano = americanoFactory.orderCoffee();

        CoffeeFactory cappuccinoFactory = new CappuccinoFactory();
        Coffee cappuccino = cappuccinoFactory.orderCoffee();
    }
}
