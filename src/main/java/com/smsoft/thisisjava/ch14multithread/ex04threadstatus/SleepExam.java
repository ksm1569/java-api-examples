package com.smsoft.thisisjava.ch14multithread.ex04threadstatus;

import java.awt.*;

public class SleepExam {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
    }
}
