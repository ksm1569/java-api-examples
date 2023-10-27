package com.smsoft.thisisjava.ch11exception.ex05;

public class ThrowsExam2 {
    public static void main(String[] args) throws Exception{
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
