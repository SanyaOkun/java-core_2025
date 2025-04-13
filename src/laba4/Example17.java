package laba4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte[] array = new byte[5];
        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    System.out.print("Введите элемент " + (i + 1) + ": ");
                    byte value = in.nextByte();
                    array[i] = value;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введена строка или значение не в диапазоне от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE + ". Попробуйте еще раз.");
                    in.next();
                }
            }
        }

        byte sum = 0;
        for (byte b : array) {
            if (sum > (Byte.MAX_VALUE - b)) {
                System.out.println("Ошибка: сумма элементов за границами диапазона типа.");
                return;
            }
            sum += b;
        }

        System.out.println("Сумма элементов: " + sum);

        in.close();
        System.out.println("Программа завершена.");
    }
}