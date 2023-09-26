package com.smsoft.ch15collection.ex11comparator;

import java.util.TreeSet;

public class ComparatorExam {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());

        treeSet.add(new Fruit("딸기", 10000));
        treeSet.add(new Fruit("포도", 8000));
        treeSet.add(new Fruit("수박", 20000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
