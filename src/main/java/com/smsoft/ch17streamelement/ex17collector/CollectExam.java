package com.smsoft.ch17streamelement.ex17collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExam {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("봉주희", "여", 100));
        list.add(new Student("김수민", "남", 70));
        list.add(new Student("봉수진", "여", 60));
        list.add(new Student("봉준", "남", 50));

        // 자바 17 부터는 .collect(Collectors.toList()); -> toList() 로 끝남
        List<Student> maleList = list.stream()
                .filter(s -> s.getSex().equals("남"))
                .collect(Collectors.toList());

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        Map<String, Integer> map = list.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );
        System.out.println(map);
    }
}
