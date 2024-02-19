package com.smsoft.blogsamplecode.concurrency;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MutexExampleTest {

    @Test
    @DisplayName("Mutex로 자원접근")
    void mutexAccess() throws InterruptedException {
        final MutexExample example = new MutexExample();
        ExecutorService executor = Executors.newFixedThreadPool(5); // 동시에 5개의 스레드를 실행

        for (int i = 0; i < 5; i++) {
            final int threadId = i;
            executor.submit(() -> example.accessResource(threadId));
        }

        executor.shutdown();
        boolean finished = executor.awaitTermination(10, TimeUnit.SECONDS);
        assert finished;
    }
}