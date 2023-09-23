package com.smsoft.ch17streamelement.ex01stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("봉주희");
        set.add("김수민");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
