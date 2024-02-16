package com.smsoft.gof_designpattern.singletonpattern;

// 방법 1: Lazy Initialization Singleton
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }
}
