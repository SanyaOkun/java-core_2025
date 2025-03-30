package laba3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = in.nextInt();
        in.close();

        System.out.println("Двоичное представление числа " + number + ":");
        printBinary(number);
    }

    public static void printBinary(int number) {
        if (number == 0) {
            return;
        } else {
            printBinary(number / 2);
            System.out.print(number % 2);
        }
    }
}
