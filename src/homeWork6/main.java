package homeWork6;

import java.io.*;

public class main {
    public static void writeFile(String fileName, String line, int repeat){
        try {
            FileOutputStream file = new FileOutputStream(fileName, true);
            for(int i = 0; i < repeat; i++) {
                file.write(line.getBytes());
            }
            file.flush();
            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFile(String fileName) {
        String temp = "";
        try {
            FileInputStream file = new FileInputStream(fileName);
            int b;
            while ((b = file.read()) != -1) {
                temp += (char) b;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return temp;
    }

    public static void main(String[] args) {
        // Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
        // Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.

        String file1 = "test1.txt";
        String file2 = "test2.txt";
        writeFile(file1, "Something old...\n", 50);
        writeFile(file2, "Something new...\n", 50);

        String newFile = readFile(file1) + readFile(file2);
        System.out.println(newFile);
        
    }
}
