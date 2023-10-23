package com.smsoft.thisisjava.ch17streamelement.ex18grouping;

import com.smsoft.thisisjava.ch17streamelement.ex17collector.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExam01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("봉주희", "여", 100));
        list.add(new Student("김수민", "남", 70));
        list.add(new Student("봉수진", "여", 60));
        list.add(new Student("봉준", "남", 50));

        Map<String, List<Student>> map = list.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSex())
                );

        List<Student> maleList = map.get("남");
        maleList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> femaleList = map.get("여");
        femaleList.stream().forEach(s -> System.out.println(s.getName()));
    }
}
