package com.smsoft.thisisjava.ch06class.ex03constructor;

public class KoreanExam {
    public static void main(String[] args) {
        Korean k1 = new Korean("김수민", "930907-1118");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        System.out.println();

        Korean k2 = new Korean("봉주희", "901103-2xxx");
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);

    }
}
