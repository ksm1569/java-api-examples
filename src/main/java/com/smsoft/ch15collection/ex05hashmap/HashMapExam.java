package com.smsoft.ch15collection.ex05hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("봉주희", 100);
        map.put("김수민", 80);
        map.put("봉수진", 70);
        map.put("봉준", 50);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        String key = "김수민";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        //keyset
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();

        //entryset
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ": " + v);
        }
        System.out.println();

        map.remove("봉준");
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();
    }
}
