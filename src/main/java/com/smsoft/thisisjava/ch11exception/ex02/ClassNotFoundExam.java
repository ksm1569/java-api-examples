package com.smsoft.thisisjava.ch11exception.ex02;

public class ClassNotFoundExam {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스는 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스는 존재합니다");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
