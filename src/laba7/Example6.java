package laba7;

import java.io.*;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите путь к входному файлу: ");
        String inputFileName = in.nextLine();

        System.out.print("Введите путь к выходному файлу: ");
        String outputFileName = in.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter = new PrintWriter(new FileWriter(outputFileName), true)) {
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }

        in.close();
    }
}