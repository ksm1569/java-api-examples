package com.smsoft.thisisjava.ch14multithread.ex04threadstatus;

public class JoinExam {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {

        }

        // sumThread가 끝날때까지 기다림
        System.out.println("1~100 합 : " + sumThread.getSum());
    }
}
