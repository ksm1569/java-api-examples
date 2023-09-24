package com.smsoft.ch15collection.ex02vector;

import com.smsoft.ch15collection.ex01arraylist.Board;

import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExam {
    public static void main(String[] args) {
        // arraylist는 동시에 메서드 호출이 가능
        //List<Board> list = new ArrayList<>();
        List<Board> list = new Vector<>();
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++) {
                    list.add(new Board("subject" + i, "content" + i, "writer" + i));
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i=1001; i<=2000; i++) {
                    list.add(new Board("subject" + i, "content" + i, "writer" + i));
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {

        }

        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();

    }
}
