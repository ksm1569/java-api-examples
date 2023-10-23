package com.smsoft.thisisjava.ch6class.ex07methodreturn;

public class CarExam {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(10);

        if(myCar.isLeftGas()) {
            System.out.println("출발합니다.");

            myCar.run();
        }

        System.out.println("gas를 주입하세요.");
    }
}
