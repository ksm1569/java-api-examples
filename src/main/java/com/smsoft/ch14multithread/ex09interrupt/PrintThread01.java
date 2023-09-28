package com.smsoft.ch14multithread.ex09interrupt;

public class PrintThread01 extends Thread{
    public void run() {
        try {
            while (true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {}

        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
