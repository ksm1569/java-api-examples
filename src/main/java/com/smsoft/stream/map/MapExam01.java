package com.smsoft.stream.map;

import java.util.ArrayList;
import java.util.List;

public class MapExam01 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("봉주희", 100));
        studentList.add(new Student("김수민", 70));
        studentList.add(new Student("봉수진", 65));

        studentList.stream()
                .mapToInt(s -> s.getScore())
                .forEach(score -> System.out.println(score));
    }
}