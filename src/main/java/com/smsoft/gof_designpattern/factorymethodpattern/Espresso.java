package com.smsoft.gof_designpattern.factorymethodpattern;

// ConcreteProduct
public class Espresso implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Espresso!");
    }

    @Override
    public void serve() {
        System.out.println("Serving Espresso in a small cup");
    }
}
