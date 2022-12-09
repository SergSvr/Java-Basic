package lesson10;

import java.io.*;
import java.util.ArrayList;

public class Reader {
    File file;

    Reader() {
    }

    Reader(String path) {
        setPath(path);
    }

    public void setPath(String path) {
        this.file = new File(path);
    }

    public void showFile(String path){
        setPath(path);
        for (String temp : readFile()) {
            System.out.println(temp);
        }
    }

    public ArrayList<String> readFile() {
        ArrayList<String> content = new ArrayList<>();
        if (file.exists()) {
            try (BufferedReader buf = new BufferedReader(new FileReader(file))) {
                String input;
                while ((input = buf.readLine()) != null) {
                    content.add(input);
                }
            } catch (IOException e) {
                System.err.println("Error" + e.getMessage());
            }
        } else {
            System.err.println("File not exist!");
        }
        return content;
    }

}
