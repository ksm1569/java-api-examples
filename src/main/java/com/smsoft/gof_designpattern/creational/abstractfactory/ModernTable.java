package com.smsoft.gof_designpattern.creational.abstractfactory;

// ConcreteProduct - Modern 제품군 테이블
public class ModernTable implements Table{
    public void create() {
        System.out.println("Modern 제품군 테이블 생성!!!");
    }
}
