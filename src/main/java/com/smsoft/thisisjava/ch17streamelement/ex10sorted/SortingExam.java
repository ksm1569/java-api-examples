package com.smsoft.thisisjava.ch17streamelement.ex10sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExam {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("봉주희", 100));
        list.add(new Student("김수민", 60));
        list.add(new Student("봉수진", 50));

        list.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

        System.out.println();

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
