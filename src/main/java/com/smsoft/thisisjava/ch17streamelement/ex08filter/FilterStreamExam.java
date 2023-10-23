package com.smsoft.thisisjava.ch17streamelement.ex08filter;

import java.util.ArrayList;
import java.util.List;

public class FilterStreamExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("봉주희");
        list.add("봉주희");
        list.add("김수민");
        list.add("봉수진");
        list.add("봉준");
        list.add("봉준");

        System.out.println(list);

        //중복 제거
        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));

        System.out.println();

        // 중복제거 + 필터
        list.stream()
                .distinct()
                .filter(n -> n.contains("봉"))
                .forEach(n -> System.out.println(n));

    }
}
