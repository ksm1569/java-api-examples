package com.smsoft.ch14multithread.ex09interrupt;

public class InterruptExam02 {
    public static void main(String[] args) {
        Thread thread = new PrintThread02();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
