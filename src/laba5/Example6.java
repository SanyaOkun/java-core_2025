package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка целых чисел:");
        int size = in.nextInt();
        in.nextLine();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Введите целое число " + (i + 1) + ":");
            numbers.add(in.nextInt());
        }
        in.nextLine();

        System.out.println("Введите число для проверки деления:");
        int divisor = in.nextInt();
        in.close();

        List<Integer> result = filterNumbers(numbers, divisor);

        System.out.println("Исходный список:");
        System.out.println(numbers);
        System.out.println("Список чисел, делящихся на " + divisor + " без остатка:");
        System.out.println(result);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % divisor == 0) {
                result.add(number);
            }
        }
        return result;
    }
}
