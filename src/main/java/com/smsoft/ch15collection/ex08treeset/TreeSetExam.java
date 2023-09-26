package com.smsoft.ch15collection.ex08treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(50);
        scores.add(30);
        scores.add(100);
        scores.add(97);

        for(Integer s : scores) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("가장 낮은 점수 : " + scores.first());
        System.out.println("가장 높은 점수 : " + scores.last());
        System.out.println("97점 아래 점수 : " + scores.lower(97));
        System.out.println("97점 위 점수 : " + scores.higher(97));
        System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(95));
        System.out.println("95점이거나 바로 위의 점수 : " + scores.ceiling(95));
        System.out.println();

        // 내림차순 정렬
        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for(Integer s : descendingSet) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 범위 검색 tailSet 50 <= x
        NavigableSet<Integer> rangeSet = scores.tailSet(50, true);
        for(Integer s : rangeSet) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 범위 검색 subSet 30 <= x < 87
        rangeSet = scores.subSet(30, true, 87, false);
        for(Integer s : rangeSet) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
