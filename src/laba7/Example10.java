package laba7;

import java.io.File;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String fileName = in.nextLine();

        File file = new File(fileName);
        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("Размер файла: " + fileSize + " байт");
        } else {
            System.out.println("Файл не найден!");
        }
        in.close();
    }
}
