package laba7;

import java.io.*;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите путь к файлу: ");
        String fileName = in.nextLine();

        System.out.print("Введите текст для записи в файл: ");
        String data = in.nextLine();

        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(data.getBytes());
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        if (new File(fileName).delete()) {
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }

        in.close();
    }
}