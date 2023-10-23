package com.smsoft.thisisjava.ch13generic.ex05genericmethod;

public class GenericExam {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println("value : " + intValue);

        Box<String> box2 = boxing("김수민");
        String strValue = box2.get();
        System.out.println("value : " + strValue);
    }
}
