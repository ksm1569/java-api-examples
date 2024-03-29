package com.smsoft.thisisjava.ch17streamelement.ex10sorted;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student (String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score); // 같으면 0, 작으면 -, 크면 +
    }
}
