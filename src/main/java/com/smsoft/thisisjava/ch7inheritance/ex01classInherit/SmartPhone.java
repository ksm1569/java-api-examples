package com.smsoft.thisisjava.ch7inheritance.ex01classInherit;

public class SmartPhone extends Phone{
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model = model;     // 상속받은 필드
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태 변경완료");
    }

    public void internet() {
        System.out.println("인터넷에 연결");
    }
}
