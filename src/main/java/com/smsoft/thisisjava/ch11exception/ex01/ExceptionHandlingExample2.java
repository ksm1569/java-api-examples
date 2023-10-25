package com.smsoft.thisisjava.ch11exception.ex01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자수 : " + result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //e.printStackTrace();
        } finally {
            System.out.println("static 메소드 종료");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("sumin2");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
