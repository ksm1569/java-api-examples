package com.smsoft.ch15collection.ex10comparable;

import java.util.TreeSet;

public class ComparableExam {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("봉주희", 17));
        treeSet.add(new Person("김수민", 23));
        treeSet.add(new Person("봉수진", 14));

        for (Person person : treeSet) {
            System.out.println(person.name + " : " + person.age);
        }
    }
}
