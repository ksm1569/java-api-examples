package com.smsoft.gof_designpattern.abstractfactory;

// ConcreteProduct - Traditional 제품군 의자
public class TraditionalChair implements Chair{
    public void create() {
        System.out.println("Traditional 제품군 의자 생성!!!");
    }
}
