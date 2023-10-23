package com.smsoft.thisisjava.ch15collection.ex04hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("봉주희");
        set.add("김수민");
        set.add("봉수진");
        set.add("봉준");
        set.add("김수민");

        int size = set.size();
        System.out.println("총 객체수 : " + size);
    }
}
