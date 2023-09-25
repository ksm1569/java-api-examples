package com.smsoft.ch17streamelement.ex18grouping;

import com.smsoft.ch17streamelement.ex17collector.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExam02 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("봉주희", "여", 100));
        list.add(new Student("김수민", "남", 90));
        list.add(new Student("봉수진", "여", 70));
        list.add(new Student("봉준", "남", 60));

        Map<String, Double> map = list.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getSex(),
                                Collectors.averagingDouble(s -> s.getScore())
                        )
                );

        System.out.println(map);
    }
}
