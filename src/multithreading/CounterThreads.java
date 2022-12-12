package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThreads extends Thread {
    private final Integer id;
    static Counter counter = new Counter();
    static ReentrantLock lock = new ReentrantLock();
    private final CountDownLatch latch;

    CounterThreads(int id, CountDownLatch latch) {
        this.id = id;
        this.latch = latch;
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("Thread #" + id + " status:" + this.getState());
        while (i++ < 1000) {
            lock.lock();
            counter.increment();
            lock.unlock();
            CounterThreads.yield();
        }
        System.out.println("Thread #" + id + " Completed");
        latch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            CounterThreads temp = new CounterThreads(i, latch);
            temp.start();
        }
        latch.await();
        System.out.println("Result: " + CounterThreads.counter.getCount());
    }
}
