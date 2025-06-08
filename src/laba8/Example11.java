package laba8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;

        while (!success) {
            System.out.print("Введите путь к Excel файлу (например, src/laba8/example.xlsx): ");
            String filePath = scanner.nextLine();

            try (FileInputStream inputStream = new FileInputStream(filePath);
                 XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

                String sheetName = "Товары";
                XSSFSheet sheet = workbook.getSheet(sheetName);

                if (sheet == null) {
                    System.out.println("Ошибка: Лист с названием \"" + sheetName + "\" не найден.");
                    System.out.println("Проверьте имя листа в файле и попробуйте снова.\n");
                    continue;
                }

                System.out.println("Данные из листа \"" + sheetName + "\":");
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }
                success = true;
            } catch (IOException e) {
                System.out.println("Ошибка при работе с файлом: " + e.getMessage());
                System.out.println("Убедитесь, что файл существует, доступен и имеет правильный формат (.xlsx).\n");
            } catch (Exception e) {
                System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
                System.out.println("Попробуйте проверить файл или перезапустить программу.\n");
            }

            if (!success) {
                System.out.print("Хотите попробовать снова? (да/нет): ");
                String answer = scanner.nextLine().trim().toLowerCase();
                if (!answer.equals("да") && !answer.equals("yes")) {
                    System.out.println("Завершение программы.");
                    break;
                }
            }
        }
        scanner.close();
    }
}
