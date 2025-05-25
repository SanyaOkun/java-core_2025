package laba7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите путь к папке: ");
        String folderPath = in.nextLine();

        File folder = new File(folderPath);
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Папка создана: " + folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать папку: " + folder.getAbsolutePath());
            }
        } else {
            System.out.println("Папка уже существует: " + folder.getAbsolutePath());
        }

        System.out.print("Введите имя файла: ");
        String fileName = in.nextLine();

        File file = new File(folder.getAbsolutePath() + File.separator + fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать файл: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

        System.out.print("Удалить файл и папку? (yes/no): ");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            if (file.delete()) {
                System.out.println("Файл удален: " + file.getAbsolutePath());
            } else {
                System.out.println("Не удалось удалить файл: " + file.getAbsolutePath());
            }

            if (folder.delete()) {
                System.out.println("Папка удалена: " + folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось удалить папку: " + folder.getAbsolutePath());
            }
        } else {
            System.out.println("Файл и папка не удалены.");
        }
        in.close();
    }
}