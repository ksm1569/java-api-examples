package com.smsoft.blogsamplecode.ex02;

public class run {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("제목", "출판사", "작가");
        Book book3 = new Book("제목2", "출판사2", "작가2", 10000, 10.0);

        book1.inform();
        book2.inform();
        book3.inform();
    }
}
