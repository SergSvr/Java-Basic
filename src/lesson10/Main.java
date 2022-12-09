package lesson10;

import java.util.Scanner;

public class Main {
    public static String readPath(String file) {
        if (file.matches("\\w:\\\\.*"))
            return file;
        return "files/" + file;
    }

    public static void combineFiles(String file1, String file2, String result) {
        Reader file1r = new Reader(file1);
        Reader file2r = new Reader(file2);
        for (String string : file1r.readFile()) {
            Writer.writeRow(result, string);
        }
        for (String string : file2r.readFile()) {
            Writer.writeRow(result, string);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file1;
        String file2;
        String result;
        Reader reader = new Reader();
        //subtask1
        System.out.println("Введите имя файла для чтения:");
        file1 = readPath(scan.nextLine());
        System.out.println("Содержимое файла:");
        reader.showFile(file1);

        //subtask2
        System.out.println("Введите имя файла для чтения:");
        file1 = readPath(scan.nextLine());
        System.out.println("Введите строку для добавления:");
        Writer.writeRow(file1, scan.nextLine());
        System.out.println("Содержимое файла:");
        reader.showFile(file1);

        //subtask 3
        System.out.println("Введите имя первого файла:");
        file1 = readPath(scan.nextLine());
        System.out.println("Введите имя второго файла:");
        file2 = readPath(scan.nextLine());
        System.out.println("Введите имя для файла с результатом:");
        result = readPath(scan.nextLine());
        combineFiles(file1, file2, result);
        System.out.println("Содержимое объединенного файла ");
        reader.showFile(result);

        //subtask 4
        System.out.println("Введите имя первого файла для замены символов:");
        file1 = readPath(scan.nextLine());
        Writer.replaceLetters(file1);
        System.out.println("Содержимое файла ");
        reader.showFile(file1);
    }
}
