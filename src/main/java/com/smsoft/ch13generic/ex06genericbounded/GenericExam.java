package com.smsoft.ch13generic.ex06genericbounded;

public class GenericExam {
    public static <T extends Number> boolean compare(T t1, T t2) {
        System.out.println("compare( " + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + " )");

        double d1 = t1.doubleValue();
        double d2 = t2.doubleValue();

        return (d1 == d2);
    }

    public static void main(String[] args) {
        boolean result1 = compare(10, 20);
        System.out.println(result1);
        System.out.println();

        boolean result2 = compare(2.5, 2.5);
        System.out.println(result2);
    }
}
