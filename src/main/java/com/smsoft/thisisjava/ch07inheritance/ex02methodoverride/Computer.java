package com.smsoft.thisisjava.ch07inheritance.ex02methodoverride;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle 실행");
        return Math.PI * r * r;
    }
}
