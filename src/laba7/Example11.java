package laba7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String fileName = in.nextLine();
        System.out.print("Введите слово для поиска: ");
        String word = in.nextLine();

        File file = new File(fileName);
        try {
            Scanner fileScanner = new Scanner(file);
            int lineNumber = 1;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.toLowerCase().contains(word.toLowerCase())) {
                    System.out.println("Строка " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        in.close();
    }
}