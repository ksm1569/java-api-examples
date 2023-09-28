package com.smsoft.ch14multithread.ex08threadsafestop;

public class SafeStopExam {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        printThread.setStop(true);
    }
}
