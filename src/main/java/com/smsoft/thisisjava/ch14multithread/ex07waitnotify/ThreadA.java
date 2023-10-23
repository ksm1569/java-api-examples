package com.smsoft.thisisjava.ch14multithread.ex07waitnotify;

public class ThreadA extends Thread{
    private WorkObject workObject;

    public ThreadA(WorkObject workObject) {
        setName("ThreadA");
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            workObject.methodA();
        }
    }
}
