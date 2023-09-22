package com.smsoft.ch14multithread.beepprint01;

import java.awt.*;

public class BeepPrintExam01 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // 비프음이 끝나고 print 된다.
        for (int i=0; i<5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }

        for (int i=0; i<5; i++) {
            System.out.println("비프음!");

            try {
                Thread.sleep(500);
            }catch (Exception e) {

            }
        }
    }
}
