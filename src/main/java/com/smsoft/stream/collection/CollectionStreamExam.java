package com.smsoft.stream.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamExam {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            Product product = new Product(i, "상품" + i, "SMSOFT", (int) (1000*Math.random()));
            list.add(product);
        }

        Stream<Product> stream = list.stream();
        stream.forEach(product -> System.out.println(product));
    }

}
