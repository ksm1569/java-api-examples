package com.smsoft.thisisjava.ch15collection.ex04hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam02 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("봉주희", 17));
        set.add(new Member("봉주희", 17));

        System.out.println("총 객체 수 : " + set.size());
    }
}
