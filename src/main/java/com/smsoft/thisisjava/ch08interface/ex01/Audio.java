package com.smsoft.thisisjava.ch08interface.ex01;

public class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다");
    }
}
