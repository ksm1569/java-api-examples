package com.smsoft.gof_designpattern.creational.abstractfactory;

// ConcreteProduct - Traditional 제품군 소파
public class TraditionalSofa implements Sofa{
    public void create() {
        System.out.println("Traditional 제품군 소파 생성!!!");
    }
}
