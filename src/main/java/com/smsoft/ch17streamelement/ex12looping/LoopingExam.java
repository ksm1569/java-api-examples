package com.smsoft.ch17streamelement.ex12looping;

import java.util.Arrays;

public class LoopingExam {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        //peek은 중간 처리 메소드라서 최종처리가 없으면 동작안함
        Arrays.stream(intArr)
                .filter(a -> a%2==0)
                .peek(n -> System.out.println(n));

        int total = Arrays.stream(intArr)
                .filter(a -> a%2==0)
                .peek(n -> System.out.println(n))
                .sum();

        System.out.println("합: " + total);

        //forEach는 최종 처리 메소드라서 동작함
        Arrays.stream(intArr)
                .filter(a -> a%2==0)
                .forEach(n -> System.out.println(n));
    }
}
