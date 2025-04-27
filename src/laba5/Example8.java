package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example8 {
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

        System.out.println("Введите значение для сравнения:");
        int value = in.nextInt();
        in.close();

        List<Integer> result = filterNumbers(numbers, value);

        System.out.println("Исходный список:");
        System.out.println(numbers);
        System.out.println("Список чисел, больших " + value + ":");
        System.out.println(result);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers, int value) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > value) {
                result.add(number);
            }
        }
        return result;
    }
}