package com.smsoft.gof_designpattern.creational.abstractfactory;

// ConcreteProduct - Traditional 제품군 테이블
public class TraditionalTable implements Table{
    public void create() {
        System.out.println("Traditional 제품군 테이블 생성!!!");
    }
}
