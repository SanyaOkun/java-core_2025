package laba4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        System.out.println("Размер массива: " + n);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Введите элемент " + (i + 1) + ": ");
                    array[i] = in.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Неверный формат ввода. Попробуйте еще раз.");
                    in.next();
                }
            }
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                sum += array[i];
                count++;
            }
        }

        try {
            if (count == 0) {
                throw new RuntimeException("Положительные элементы отсутствуют.");
            }
            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: " + average);
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            in.close();
            System.out.println("Программа завершена.");
        }
    }
}