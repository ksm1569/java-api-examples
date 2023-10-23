package com.smsoft.thisisjava.ch6class.ex06methodvariable;

public class ComputerExam {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int result1 = myCom.sum(1,2,3,4);
        System.out.println("result1 : " + result1);

        int[] values = {1, 2, 3, 4, 5};
        int result2 = myCom.sum(values);
        System.out.println("result2 : " + result2);

        int result3 = myCom.sum(new int[] {1, 2, 3, 4, 5});
        System.out.println("result3 : " + result3);
    }
}
