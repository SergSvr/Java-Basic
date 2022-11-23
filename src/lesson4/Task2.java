package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //subtask1
        System.out.println("Subtask 1");
        int[] array1 = arrayInput();
        System.out.println("array=" + Arrays.toString(array1));
        if (sortCheck(array1)) System.out.println("OK");
        else System.out.println("Please, try again");

        //subtask2
        System.out.println("Subtask 2");
        int[] array2 = arrayInput();
        System.out.println("Result: " + Arrays.toString(array2));

        //subtask3
        System.out.println("Subtask 3");
        int[] array3 = arrayInput();
        System.out.println("Array 1: " + Arrays.toString(array3));
        System.out.println("Array 2: " + Arrays.toString(swapFirstLast(array3)));

        //subtask4
        System.out.println("Subtask 4");
        int[] array4 = arrayInput();
        System.out.println("Array=" + Arrays.toString(array4) + "\nResult:" + findUniqueNumber(array4));
    }

    public static boolean sortCheck(int[] a) {
        if (a.length > 1) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) return false;
            }
            return true;
        }
        return true;//zero-length array does not require sorting
    }

    public static String findUniqueNumber(int[] a) {
        if (a.length > 0) {
            if (a.length == 1) return String.valueOf(a[0]);
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
        return "Wrong Array";
    }

    public static int[] arrayInput() {
        System.out.print("Введите количество элементов: ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        if (length > 0) {
            int[] array = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.print("\nВведите элемент " + (i + 1) + ": ");
                array[i] = scan.nextInt();
            }
            return array;
        } else System.out.println("Некорректное значение!");
        return new int[]{};
    }

    public static int[] swapFirstLast(int[] a) {
        if (a.length > 1) {
            int temp = a[0];
            a[0] = a[a.length - 1];
            a[a.length - 1] = temp;
        }
        return a;
    }
}
