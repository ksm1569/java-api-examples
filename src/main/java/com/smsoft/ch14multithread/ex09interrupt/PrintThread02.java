package com.smsoft.ch14multithread.ex09interrupt;

public class PrintThread02 extends Thread{
    public void run() {
        while (true) {
            System.out.println("실행 중");
            if(Thread.interrupted()) {
                break;
            }
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
