package multithreading;

import java.util.ArrayList;

public class MyThread extends Thread {
    protected int counter;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public MyThread(int counter) {
        this.counter = counter;
    }

    public int getThisId(){
        return this.id;
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("\nThread #"+id+" status:"+this.getState());
        while (i++ < counter) {
            System.out.print("thr#" + id + "(" + i + ") ");
            MyThread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<MyThread> Arr=new ArrayList<>();
        for (int i = 0; i < 10; i++){
            MyThread temp=new MyThread(100);
            Arr.add(temp);
            System.out.print("\nThread #"+i+" status:"+temp.getState());
            temp.start();
        }
        for(MyThread temp : Arr){
            temp.join();
        }
        for(MyThread temp : Arr){
            System.out.print("\nThread #"+(temp.getThisId())+" status:"+temp.getState());
        }
    }
}
