package com.smsoft.ch7inheritance.ex10abstractclass;

public class SmartPhone extends Phone{
    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("인터넷을 검색합니다");
    }
}
