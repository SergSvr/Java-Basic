package multithreading;

public class NameThreads extends Thread {
    private final String name;
    private final Integer temp;

    NameThreads(String name, Integer temp) {
        this.name = name;
        this.temp = temp;
    }

    public void showName() {

        System.out.println(this.name);
    }

    @Override
    public void run() {
        synchronized (temp) {
            while (true) {
                showName();
                temp.notify();
                try {
                    temp.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer temp=0;
        NameThreads name1 = new NameThreads("Serg", temp);
        NameThreads name2 = new NameThreads("Nastya",  temp);
        name1.start();
        name2.start();
    }
}
