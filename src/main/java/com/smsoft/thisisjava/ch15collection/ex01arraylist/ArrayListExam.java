package com.smsoft.thisisjava.ch15collection.ex01arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("주희는 대장이라는 글", "주희의 세계정복 이야기", "김수민 작가님"));
        list.add(new Board("수민이는 앞잡이라는 글", "수민이의 뒷바라지 이야기", "김수민 작가님"));
        list.add(new Board("수진이는 왼팔이라는 글", "닦개님의 힘든 삶의 이야기", "김수민 작가님"));

        // 총 객체 수
        int size = list.size();
        System.out.println("객체 수 : " + size);

        //인덱스에 담긴 객체 받아오기
        Board board = list.get(1);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());

        System.out.println();

        //모든 객체 하나씩 가져오기
        for(int i=0; i<list.size(); i++) {
            Board b= list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }

        System.out.println();

        //객체 삭제
        list.remove(2);

        // 향상된 for문
        for(Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getSubject() + "\t" + b.getWriter());
        }
    }
}
