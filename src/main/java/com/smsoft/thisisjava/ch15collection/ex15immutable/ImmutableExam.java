package com.smsoft.thisisjava.ch15collection.ex15immutable;

import java.util.*;

public class ImmutableExam {
    public static void main(String[] args) {
        //List 불변
        List<String> immutableList = List.of("A", "B", "C");

        //Set 불변
        Set<String> immutableSet = Set.of("A", "B", "C");

        //Map 불변
        Map<Integer, String> immutableMap = Map.of(1, "A", 2,"B", 3, "C");

        // List 불변 컬렉션으로 복사
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);

        // Set 불변 컬렉션으로 복사
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);

        // Map 불변 컬렉션으로 복사
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);

        // 배열로부터 List 불변 컬렉션 생성
        String[] arr = {"A", "B", "C"};
        List<String> immutableList3 = Arrays.asList(arr);

    }
}
