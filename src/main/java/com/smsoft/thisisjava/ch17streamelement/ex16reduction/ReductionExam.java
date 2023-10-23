package com.smsoft.thisisjava.ch17streamelement.ex16reduction;

import java.util.Arrays;
import java.util.List;

public class ReductionExam {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("봉주희", 100),
                new Student("김수민", 70),
                new Student("봉수진", 50)
        );

        int sum1 = list.stream()
                .mapToInt(Student::getScore)
                .sum();

        int sum2 = list.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a+b);

        System.out.println(sum1);
        System.out.println(sum2);

    }
}
