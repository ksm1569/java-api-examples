package com.smsoft.thisisjava.ch15collection.ex04hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam03 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("김수민");
        set.add("봉주희");
        set.add("봉수진");
        set.add("봉준");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("봉준")) {
                iterator.remove();
            }
        }

        set.remove("봉수진");
        System.out.println();
        for (String element : set) {
            System.out.println(element);
        }
    }
}
