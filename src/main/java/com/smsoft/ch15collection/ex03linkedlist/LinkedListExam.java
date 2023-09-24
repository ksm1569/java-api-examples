package com.smsoft.ch15collection.ex03linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        Long startTime;
        Long endTime;

        //arraylist 저장 시간 측정
        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.printf("%-17s %8d ns \n", "ArrayList 시간 : ", (endTime - startTime));

        //linkedlist 저장 시간 측정
        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.printf("%-17s %8d ns \n", "LinkedList 시간 : ", (endTime - startTime));
    }
}
