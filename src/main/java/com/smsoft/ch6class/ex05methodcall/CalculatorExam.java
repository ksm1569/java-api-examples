package com.smsoft.ch6class.ex05methodcall;

public class CalculatorExam {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.powerOn();

        int result1 = myCalc.plus(1, 2);
        System.out.println("result1 : " +result1);

        int x = 22;
        int y = 4;

        double result2 = myCalc.divide(x, y);
        System.out.println("result2 : " + result2);

        myCalc.powerOff();
    }
}
