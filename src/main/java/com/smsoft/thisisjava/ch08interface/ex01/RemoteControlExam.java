package com.smsoft.thisisjava.ch08interface.ex01;

public class RemoteControlExam {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();

        // 구현 객체 교체
        rc = new Audio();
        rc.turnOn();
    }
}
