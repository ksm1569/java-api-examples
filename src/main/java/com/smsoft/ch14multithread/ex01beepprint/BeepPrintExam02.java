package com.smsoft.ch14multithread.ex01beepprint;

import java.awt.*;

public class BeepPrintExam02 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 작업스레드 영역
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for (int i=0; i<5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {

                    }
                }
            }
        });

        thread.start();
        
        // 메인스레드 영역
        for (int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
