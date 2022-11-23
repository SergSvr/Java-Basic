package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //subtask1
        System.out.println("Subtask 1");
        int[] array1 = {3, -3, 7, 4, 5, 4, 3};
        //array1 = new int[]{1, 2, 3, 4, 5, -6}; //test
        System.out.println("array=" + Arrays.toString(array1));
        if (subtask1(array1))
            System.out.println("OK");
        else
            System.out.println("Please, try again");

        //subtask2
        System.out.println("Subtask 2");
        System.out.print("Введите количество элементов: ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        if (length > 0) {
            int[] array2 = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.print("\nВведите элемент " + (i + 1) + ": ");
                array2[i] = scan.nextInt();
            }
            System.out.println("Result: " + Arrays.toString(array2));
        } else
            System.out.println("Некорректное значение!");

        //subtask3
        System.out.println("Subtask 3");
        int[] array3 = {3, -3, 7, 4, 5, 4, 22};
        System.out.println("Array 1: " + Arrays.toString(array3));
        int temp = array3[0];
        array3[0] = array3[array3.length - 1];
        array3[array3.length - 1] = temp;
        System.out.println("Array 2: " + Arrays.toString(array3));

        //subtask4
        System.out.println("Subtask 4");
        int[] array4 = {1, 2, 2, 1, 1, 2, 22};
        System.out.println("Array=" + Arrays.toString(array4) + "\nResult:" + subtask4(array4));
    }

    public static boolean subtask1(int[] a) {
        if (a.length > 1) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) return false;
            }
            return true;
        }
        return true;//zero-length array does not require sorting
    }

    public static String subtask4(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    break;
                } else if (j == a.length - 1) {
                    return String.valueOf(a[i]);
                }
            }
        }
        return "Not Found";
    }
}
