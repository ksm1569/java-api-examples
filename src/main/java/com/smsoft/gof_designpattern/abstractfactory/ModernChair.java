package com.smsoft.gof_designpattern.abstractfactory;

// ConcreteProduct - Modern 제품군 의자
public class ModernChair implements Chair{
    public void create() {
        System.out.println("Modern 제품군 의자 생성!!!");
    }
}
