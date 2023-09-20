package com.smsoft.stream_exam.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PipelineExam {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("봉주희", 100),
                new Student("김수민", 70),
                new Student("봉수진", 50)
        );

        // 방법 1
//        Stream<Student> studentStream = list.stream();
//        IntStream intStream = studentStream.mapToInt(student -> student.getScore());
//        double avg = intStream.average().getAsDouble();

        // 방법 2
        double avg = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();

        System.out.println(avg);

    }
}
