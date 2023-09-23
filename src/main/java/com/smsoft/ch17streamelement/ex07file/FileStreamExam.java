package com.smsoft.ch17streamelement.ex07file;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamExam {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get(FileStreamExam.class.getClassLoader().getResource("data.txt").toURI());
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(line -> System.out.println(line));
        stream.close();
    }
}
