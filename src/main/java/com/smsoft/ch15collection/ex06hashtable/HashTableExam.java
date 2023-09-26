package com.smsoft.ch15collection.ex06hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExam {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for(int i=1001; i<=2000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        threadA.run();
        threadB.run();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {

        }

        int size = map.size();
        System.out.println("총 엔트리 수 : " + size);
    }
}
