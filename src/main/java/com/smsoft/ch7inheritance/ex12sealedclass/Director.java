package com.smsoft.ch7inheritance.ex12sealedclass;

public class Director extends Manager{
    @Override
    public void work() {
        System.out.println("제품을 기획합니다.");
    }
}
