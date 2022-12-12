package multithreading;

import java.util.ArrayList;

public interface ThreadInterface {
    ArrayList<MyThread> arr=new ArrayList<>();

    static void addToList(MyThread tr1) {
        arr.add(tr1);
    }

    static ArrayList<MyThread> getList() {
        return arr;
    }
}
