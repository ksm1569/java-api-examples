package com.smsoft.thisisjava.ch06class.ex02field;

public class CarExam01 {
    public static void main(String[] args) {
        Car01 myCar = new Car01();

        // 디폴트 값
        System.out.println("모델명 : " + myCar.model);
        System.out.println("시동여부 : " + myCar.start);
        System.out.println("현재속도 : " + myCar.speed);
    }
}
