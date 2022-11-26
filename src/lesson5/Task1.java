package lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String str;
        String sub;

        //subtask 1
        System.out.print("\nВведите текст:");
        System.out.println("Самое длинное слово:" + longestWord(getWord()));

        //subtask 2
        System.out.print("Введите слово:");
        str = getWord().trim();
        if (str.contains(" ") || str.length() == 0)
            System.out.println("Введено не слово!");
        else
            System.out.println("Полиндром:" + isPolyndrom(str));

        //subtask 3
        System.out.print("\nВведите текст:");
        str = getWord();
        System.out.print("\nВведите слово для замены:");
        String pattern = getWord();
        if (pattern.length()>0) {
            System.out.print("\nНа что заменять:");
            String repl = getWord();
            System.out.println("Цензурированная версия:" + replaceBadWord(str, pattern, repl));
        } else
            System.out.println("Цензурированная версия:" + replaceBadWord(str));

        //subtask 4
        System.out.print("\nВведите текст:");
        str = getWord();
        System.out.print("\nВведите подстроку:");
        sub = getWord();
        System.out.print("\nРезультат:");
        if (sub.length() == 0 || str.length() == 0)
            System.out.println("Некорректные параметры");
        else {
            System.out.println(substringCount(str, sub));
        }

        //subtask 5
        System.out.print("\nВведите текст:");
        str = getWord();
        System.out.println("\nРеверсированый текст: " + reverseWords(str));
    }

    public static String getWord() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static String longestWord(String str) {
        if (str.length() > 0) {
            int size = 0;
            String res = "";
            str = str.replaceAll("[,.\\[\\]!$&()=@{}-]", "");
            for (String s : str.split(" ")) {
                if (size < s.length()) {
                    size = s.length();
                    res = s;
                }
            }
            return res;
        }
        return " Empty String!";
    }

    public static boolean isPolyndrom(String s) {
        StringBuilder buf = new StringBuilder(s.trim().toLowerCase());
        return (s.trim().toLowerCase().equals(buf.reverse().toString()));
    }

    public static String replaceBadWord(String s) {
        return s.replaceAll("бяка", "[вырезано цензурой]");
    }

    public static String replaceBadWord(String s, String pattern, String repl) {
        return s.replaceAll(pattern, repl);
    }

    public static int substringCount(String str, String sub) {
        if (sub.length() > str.length()) return 0;
        String[] temp = str.split(sub);
        if (temp.length > 1) {
            return temp.length - 1;
        }
        return 0;
    }

    public static String reverseWords(String str) {
        String[] temp = str.split(" ");
        StringBuilder res = new StringBuilder();
        for (String s : temp) {
            StringBuilder buf = new StringBuilder();
            res.append(buf.append(s).reverse()).append(" ");
        }
        return String.valueOf(res);
    }
}
