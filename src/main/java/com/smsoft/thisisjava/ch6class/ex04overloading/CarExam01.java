package com.smsoft.thisisjava.ch6class.ex04overloading;

public class CarExam01 {
    public static void main(String[] args) {
        Car01 car1 = new Car01();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Car01 car2 = new Car01("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        Car01 car3 = new Car01("자가용", "파란색");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Car01 car4 = new Car01("택시", "검정", 300);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    }
}
