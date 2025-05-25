package laba7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите путь к исходному файлу: ");
        String sourceFileName = in.nextLine();
        System.out.print("Введите путь к целевому файлу: ");
        String targetFileName = in.nextLine();

        try {
            Files.copy(Paths.get(sourceFileName), Paths.get(targetFileName), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Файл успешно скопирован!");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла!");
        }
        in.close();
    }
}
