package com.smsoft.thisisjava.ch17streamelement.ex09mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("My name is kim su min");
        list.add("My girlfriend's name is Bong Joo-hee");

        list.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(word -> System.out.println(word));

        System.out.println();

        List<String> list2 = Arrays.asList("10", "20", "30", "40");
        System.out.println(list2);
        list2.stream()
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];

                    for (int i=0; i<strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i]);
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(number -> System.out.println(number));
    }
}
