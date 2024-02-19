package com.smsoft.blogsamplecode.concurrency;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class SemaphoreExampleTest {

    @Test
    void semaphoreAccess() throws InterruptedException {
        final SemaphoreExample example = new SemaphoreExample();
        ExecutorService executor = Executors.newFixedThreadPool(10); // 동시에 10개의 스레드를 실행

        for (int i = 0; i < 10; i++) {
            final int threadId = i;
            executor.submit(() -> example.accessResource(threadId));
        }

        executor.shutdown();
        boolean finished = executor.awaitTermination(20, TimeUnit.SECONDS);
        assert finished;
    }
}