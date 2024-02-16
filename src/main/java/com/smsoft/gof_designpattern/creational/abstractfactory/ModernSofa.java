package com.smsoft.gof_designpattern.creational.abstractfactory;

// ConcreteProduct - Modern 제품군 소파
public class ModernSofa implements Sofa{
    public void create() {
        System.out.println("Modern 제품군 소파 생성!!!");
    }
}
