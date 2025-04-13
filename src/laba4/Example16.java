package laba4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int num = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = num;
                num++;
            }
        }

        System.out.println("Матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int columnNumber;
        while (true) {
            try {
                System.out.print("Введите номер столбца: ");
                columnNumber = in.nextInt();
                if (columnNumber < 1 || columnNumber > matrix[0].length) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введена строка вместо числа. Попробуйте еще раз.");
                in.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: нет столбца с таким номером. Попробуйте еще раз.");
            }
        }

        System.out.println("Столбец с номером " + columnNumber + ":");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][columnNumber - 1]);
        }

        in.close();
        System.out.println("Программа завершена.");
    }
}
