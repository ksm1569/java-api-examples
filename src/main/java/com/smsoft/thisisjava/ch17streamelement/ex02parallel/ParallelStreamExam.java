package com.smsoft.thisisjava.ch17streamelement.ex02parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("봉주희");
        list.add("김수민");
        list.add("봉수진");

        Stream<String> stream = list.parallelStream();
        stream.forEach(name -> {
            System.out.println( name + " : " + Thread.currentThread().getName());
        });
    }
}
