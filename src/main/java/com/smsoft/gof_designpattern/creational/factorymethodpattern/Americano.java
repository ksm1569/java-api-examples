package com.smsoft.gof_designpattern.creational.factorymethodpattern;

// ConcreteProduct
public class Americano implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Americano!");
    }

    @Override
    public void serve() {
        System.out.println("Serving Espresso in a regular cup");
    }
}
