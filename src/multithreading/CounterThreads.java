package multithreading;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThreads extends Thread {
    Integer id;
    static Counter counter = new Counter();
    static ReentrantLock lock = new ReentrantLock();

    CounterThreads(int id) {
        this.id = id;
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
    }

    public static void main(String[] args) {
        ArrayList<CounterThreads> Arr = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            CounterThreads temp = new CounterThreads(i);
            Arr.add(temp);
            temp.start();
        }
        for (CounterThreads temp : Arr) {
            while (temp.getState() != State.TERMINATED) {
            }
        }
        System.out.println("Result: " + CounterThreads.counter.getCount());
    }
}
