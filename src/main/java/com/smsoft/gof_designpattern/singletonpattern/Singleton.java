package com.smsoft.gof_designpattern.singletonpattern;

// 방법 3: Initialization-on-demand holder idiom Singleton
public class Singleton {
    private Singleton() {

    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

}
