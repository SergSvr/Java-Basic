package multithreading;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread implements ThreadInterface {
    protected int counter;
    private static int taskCount = 0;
    private final int id = taskCount++;
    private final CountDownLatch latch;

    public MyThread(int counter, CountDownLatch latch) {
        this.counter = counter;
        this.latch = latch;
    }

    public int getThisId() {
        return this.id;
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("\nThread #" + id + " status:" + this.getState());
        while (i++ < counter) {
            System.out.print("thr#" + id + "(" + i + ") ");
            MyThread.yield();
        }
        latch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            MyThread temp = new MyThread(100, latch);
            ThreadInterface.addToList(temp);
            System.out.print("\nThread #" + i + " status:" + temp.getState());
            temp.start();
        }
        latch.await();
        for (MyThread temp : ThreadInterface.getList()) {
            System.out.print("\nThread #" + (temp.getThisId()) + " status:" + temp.getState());
        }
    }
}
