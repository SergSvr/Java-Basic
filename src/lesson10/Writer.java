package lesson10;

import java.io.*;
import java.util.ArrayList;

public class Writer {
    public static void writeRow(String path, String row) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.newLine();
            writer.append(row);
        } catch (IOException e) {
            System.err.println("FileWriter exception: " + e.getMessage());
        }
    }

    public static void replaceLetters(String path) {
        Reader reader = new Reader(path);
        ArrayList<String> content = reader.readFile();
        if (content.size() > 0) {
            content.replaceAll(e -> e.replaceAll("[^A-Za-z0-9]", "\\$"));
            File file = new File(path);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; i < content.size(); i++) {
                    writer.write(content.get(i));
                    if (i + 1 < content.size())
                        writer.newLine();
                }
            } catch (IOException e) {
                System.err.println("Exception: " + e.getMessage());
            }
        }
    }
}
