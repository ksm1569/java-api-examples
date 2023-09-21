package com.smsoft.stream.mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MappingExam02 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);

        intStream
                .asDoubleStream()
                .forEach(d -> System.out.println(d));


        intStream = Arrays.stream(intArray);
        intStream
                .boxed()
                .forEach( obj -> System.out.println(obj));
    }
}
