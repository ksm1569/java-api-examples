package com.smsoft.ch09nestedclass.ex01instancemember;

public class A {
    
    //인스턴스 멤버 클래스
    class B {
        int field1 = 1;

        // 정적필드 java 17이상
        static int field2 = 2;

        B() {
            System.out.println("B-생성자 실행");
        }

        void method1() {
            System.out.println("B-method1 실행");
        }

        static void method2() {
            System.out.println("B-method2 실행");
        }
    }
    
    //인스턴스 메서드
    void useB() {
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
