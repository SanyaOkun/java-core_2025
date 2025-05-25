package laba7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String fileName = in.nextLine();
        System.out.print("Введите текст для записи в файл: ");
        String text = in.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
            System.out.println("Количество записанных символов: " + text.length());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл!");
        }
        in.close();
    }
}