package lesson4;

import java.util.Arrays;
import java.util.Scanner;

import static lesson4.Task2.arrayInput;

public class Task1 {
    public static void main(String[] args) {
        //subtask1
        for (int i = 1; i < 100; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //subtask2
        System.out.print("Делится на 3: ");
        for (int i = 3; i <= 100; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Делится на 5: ");
        for (int i = 5; i <= 100; i = i + 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Делится на 3 и на 5: ");
        for (int i = 15; i <= 100; i = i + 15) {
            System.out.print(i + " ");
        }

        //subtask3
        System.out.println("\nSubtask 3");
        int[] a = Task1.getVars();
            System.out.println(a[0] + a[1] == a[2]);

        //subtask4
        System.out.println("Subtask 4");
        a = Task1.getVars();
            System.out.println(a[0] < a[1] && a[1] < a[2]);

        //subtask5
        System.out.println("\nSubtask 5");
        int[] array1 = arrayInput();
        System.out.println("array=" + Arrays.toString(array1));
        if (array1.length != 0 && (array1[0] == 3 || array1[array1.length - 1] == 3))
            System.out.println("true");
        else
            System.out.println("false");

        //subtask6
        System.out.println("\nSubtask 6");
        int[] array2 = arrayInput();
        System.out.println("array=" + Arrays.toString(array2) + "\n" + check1or3(array2));
    }

    public static int[] getVars() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите первое число: ");
        int[] a = new int[3];
        a[0] = scan.nextInt();
        System.out.print("\nВведите второе число: ");
        a[1] = scan.nextInt();
        System.out.print("\nВведите третье число: ");
        a[2] = scan.nextInt();
        System.out.print("\nРезультат: ");
        return a;
    }

    private static boolean check1or3(int[] a) {
        for (int j : a) {
            if (j == 1 || j == 3) {
                return true;
            }
        }
        return false;
    }
}
