package com.smsoft.blogsamplecode;

public class Blog02StringBuilder {
    public static void main(String[] args) {
        StringBuilder data = new StringBuilder();   // 생성자에 값을 안넣어주면, 기본 16바이트
        data.append("합쳐");
        data.append("지는데오?");

        System.out.println(data);
    }
}
