package com.smsoft.thisisjava.ch07inheritance.ex12sealedclass;

public final class Employee extends Person{
    @Override
    public void work() {
        System.out.println("제품을 생산합니다.");
    }
}
