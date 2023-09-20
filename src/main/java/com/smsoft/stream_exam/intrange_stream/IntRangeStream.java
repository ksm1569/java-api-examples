package com.smsoft.stream_exam.intrange_stream;

import java.util.stream.IntStream;

public class IntRangeStream {
    private static int sum;

    public static void main(String[] args) {
        //IntStream intStream = IntStream.rangeClosed(1, 100); // 끝 포함
        IntStream intStream = IntStream.range(1, 100);      // 끝 미포함
        intStream.forEach(a -> sum += a);
        System.out.println("합 : " + sum);
    }
}
