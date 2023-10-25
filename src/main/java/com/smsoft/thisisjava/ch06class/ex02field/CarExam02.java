package com.smsoft.thisisjava.ch06class.ex02field;

public class CarExam02 {
    public static void main(String[] args) {
        Car02 myCar = new Car02();

        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색깔 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);

        myCar.speed = 50;
        System.out.println("수정된 현재속도 : " + myCar.speed);
    }
}
