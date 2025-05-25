package laba7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

    public class Example8 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите путь к файлу: ");
            String fileName = in.nextLine();
            try {
                long count = Files.lines(Paths.get(fileName)).count();
                System.out.println("Количество строк в файле: " + count);
            } catch (IOException e) {
                System.out.println("Ошибка при чтении файла!");
            }
            in.close();
        }
    }