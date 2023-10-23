package com.smsoft.thisisjava.ch15collection.ex09treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("banana", 20);
        treeMap.put("apple", 10);
        treeMap.put("zoo", 100);
        treeMap.put("base", 20);
        treeMap.put("cherry", 30);
        treeMap.put("ever", 40);

        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

        // 특정 키 값 가져오기
        Map.Entry<String, Integer> entry = null;
        entry = treeMap.firstEntry();
        System.out.println("제일 앞 단어 : " + entry.getKey() + " : " + entry.getValue());
        entry = treeMap.lastEntry();
        System.out.println("제일 뒤 단어 : " + entry.getKey() + " : " + entry.getValue());
        entry = treeMap.lowerEntry("cherry");
        System.out.println("cherry 앞 단어 : " + entry.getKey() + " : " + entry.getValue());
        System.out.println();

        NavigableMap<String, Integer> decendingMap = treeMap.descendingMap();
        Set<Map.Entry<String, Integer>> decendingEntrySet = decendingMap.entrySet();
        for (Map.Entry<String, Integer> e : decendingEntrySet) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        System.out.println();

        System.out.println("[c~h] 사이의 단어 검색");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "h", true);
        for (Map.Entry<String, Integer> e : rangeMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
