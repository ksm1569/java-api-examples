package com.smsoft.ch7inheritance.ex10abstractclass;

public abstract class Phone {
    String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("전원을 켭니다");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다");
    }
}
