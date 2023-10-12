package com.smsoft.ch13generic.ex01generic;

public class GenericExam {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "ㅎㅇㅎㅇ";
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.content = 200;
        int value = box2.content;
        System.out.println(value);
    }
}
