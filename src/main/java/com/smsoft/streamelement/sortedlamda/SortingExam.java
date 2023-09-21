package com.smsoft.streamelement.sortedlamda;

import java.util.ArrayList;
import java.util.List;

public class SortingExam {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("봉주희", 100));
        list.add(new Student("김수민", 60));
        list.add(new Student("봉수진", 50));

        list.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

        System.out.println();

        list.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
