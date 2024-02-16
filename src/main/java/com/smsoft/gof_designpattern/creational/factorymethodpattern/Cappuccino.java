package com.smsoft.gof_designpattern.creational.factorymethodpattern;

// ConcreteProduct
public class Cappuccino implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Cappuccino!!");
    }

    @Override
    public void serve() {
        System.out.println("Serveing Cappucino with foam on top");
    }
}
