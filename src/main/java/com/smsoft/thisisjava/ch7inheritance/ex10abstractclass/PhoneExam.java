package com.smsoft.thisisjava.ch7inheritance.ex10abstractclass;

public class PhoneExam {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("김수민");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
