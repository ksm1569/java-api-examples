package com.smsoft.thisisjava.ch6class.ex01createobject;

public class StudentExam {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 student 객체를 참조합니다.");
    }
}
