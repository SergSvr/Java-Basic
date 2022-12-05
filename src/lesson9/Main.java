package lesson9;

import java.util.*;

public class Main {
    public static ArrayList<Integer> noDuplicates(ArrayList<Integer> in) {
        Set<Integer> set = new LinkedHashSet<>(in);
        return new ArrayList<>(set);
    }

    public static void addValues(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add((int) (Math.random() * 1000));
        }
    }

    public static void getValues(List<Integer> list) {
        for (Integer i : list) {
            //dummy
            list.get(i);
        }
    }

    public static long timer(List<Integer> List) {
        long start = System.currentTimeMillis();
        addValues(List);
        getValues(List);
        long stop = System.currentTimeMillis();
        return stop - start;
    }

    public static String getScore(Map<User, Integer> users, String name) {
        for (User u : users.keySet()) {
            if (u.getName().equals(name)) {
                return users.get(u).toString();
            }
        }
        return "Не найден";
    }

    public static void generateUsers(Map<User, Integer> users) {
        for (int i = 0; i < 10; i++) {
            char[] array = new char[3];
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    array[j] = (char) (65 + (int) (Math.random() * 25));
                } else {
                    array[j] = (char) (97 + (int) (Math.random() * 25));
                }
            }
            users.put(new User(new String(array)), (int) (Math.random() * 1000));
        }
    }

    public static void main(String[] args) {
        //subtask 2
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(111, 21, 2, 2, 3, 33, 3));
        System.out.println("Before: " + arr);
        System.out.println("After: " + noDuplicates(arr));
        //subtask 3
        ArrayList<Integer> aList = new ArrayList<>();
        System.out.print("Array list time:");
        System.out.println(timer(aList));
        LinkedList<Integer> lList = new LinkedList<>();
        System.out.print("Linked list time:");
        System.out.println(timer(lList));
        //subtask 4
        Scanner scan = new Scanner(System.in);
        Map<User, Integer> users = new HashMap<>();
        generateUsers(users);
        System.out.println("\nUsers:");
        for (User u : users.keySet()) {
            System.out.println(u.getName());
        }
        System.out.print("Введите Имя:");
        String user = scan.nextLine();
        System.out.println("Счет: " + getScore(users, user));
    }
}
