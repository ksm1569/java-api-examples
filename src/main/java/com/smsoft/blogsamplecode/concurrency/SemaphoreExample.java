package com.smsoft.blogsamplecode.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private final Semaphore semaphore = new Semaphore(3); // 동시에 3개의 스레드만 접근 가능

    public void accessResource(int threadId) {
        try {
            System.out.println("Thread " + threadId + " is trying to access the resource.");
            semaphore.acquire();
            System.out.println("Thread " + threadId + " is accessing the resource.");
            // 자원에 대한 작업을 수행하는 동안 일부 지연을 추가
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("Thread " + threadId + " is releasing the resource.");
            semaphore.release();
        }
    }

}
