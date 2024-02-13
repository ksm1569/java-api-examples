package com.smsoft.gof_designpattern.singletonpattern;

public class SingletonMain {
    public static void main(String[] args) {
        // 방법 1: Lazy Initialization 싱글톤 인스턴스 생성 및 사용
        SingletonLazy lazyInstance1 = SingletonLazy.getInstance();
        SingletonLazy lazyInstance2 = SingletonLazy.getInstance();
        System.out.println("Lazy Initialization Singleton HashCode 1: " + lazyInstance1.hashCode());
        System.out.println("Lazy Initialization Singleton HashCode 2: " + lazyInstance2.hashCode());
        System.out.println("Are both Lazy instances the same? " + (lazyInstance1 == lazyInstance2));
        System.out.println();

        // 방법 2: Thread Safe Singleton 싱글톤 인스턴스 생성 및 사용
        SingletonThreadSafe threadSafeInstance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe threadSafeInstance2 = SingletonThreadSafe.getInstance();
        System.out.println("Thread Safe Singleton HashCode 1: " + threadSafeInstance1.hashCode());
        System.out.println("Thread Safe Singleton HashCode 2: " + threadSafeInstance2.hashCode());
        System.out.println("Are both Thread Safe instances the same? " + (threadSafeInstance1 == threadSafeInstance2));
        System.out.println();

        // 방법 3: Initialization-on-demand holder idiom 싱글톤 인스턴스 생성 및 사용
        Singleton holderIdiomInstance1 = Singleton.getInstance();
        Singleton holderIdiomInstance2 = Singleton.getInstance();
        System.out.println("Initialization-on-demand holder idiom Singleton HashCode 1: " + holderIdiomInstance1.hashCode());
        System.out.println("Initialization-on-demand holder idiom Singleton HashCode 2: " + holderIdiomInstance2.hashCode());
        System.out.println("Are both Holder Idiom instances the same? " + (holderIdiomInstance1 == holderIdiomInstance2));
    }
}
