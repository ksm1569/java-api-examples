package com.smsoft.blogsamplecode.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexExample {
    private final Lock lock = new ReentrantLock();

    public void accessResource(int threadId) {
        System.out.println("Thread " + threadId + " is trying to access the resource.");
        lock.lock();
        try {
            System.out.println("Thread " + threadId + " is accessing the resource.");
            // 자원에 대한 작업을 수행하는 동안 지연을 추가하여 로그 출력 관찰
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("Thread " + threadId + " is releasing the resource.");
            lock.unlock();
        }
    }
}
