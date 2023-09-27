package com.smsoft.ch14multithread.ex05threadyield;

public class YieldExam {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("workThreadA");
        WorkThread workThreadB = new WorkThread("workThreadB");
        workThreadA.start();
        workThreadB.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        workThreadA.work = false;

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }

        workThreadA.work = true;
    }
}
