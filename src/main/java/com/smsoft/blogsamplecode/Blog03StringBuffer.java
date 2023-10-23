package com.smsoft.blogsamplecode;

public class Blog03StringBuffer {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();
        StringBuffer strBuffer = new StringBuffer();

        Thread threadBuilder = new Thread(() -> {
            for(int i=1; i<=5000; i++) {
                strBuilder.append("짱");
                strBuffer.append("짱");
            }
        });

        Thread threadBuffer = new Thread(() -> {
            for(int i=1; i<=5000; i++) {
                strBuilder.append("짱");
                strBuffer.append("짱");
            }
        });

        threadBuilder.start();
        threadBuffer.start();

        try {
            threadBuilder.join();
            threadBuffer.join();
        } catch (Exception e) {}

        System.out.println("StringBuilder의 length : " + strBuilder.length());
        System.out.println("StringBuffer의 length : " + strBuffer.length());
    }
}
