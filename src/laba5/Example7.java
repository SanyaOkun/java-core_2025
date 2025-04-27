package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка строк:");
        int size = in.nextInt();
        in.nextLine();

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Введите строку " + (i + 1) + ":");
            strings.add(in.nextLine());
        }

        System.out.println("Введите минимальную длину строки:");
        int minLength = in.nextInt();
        in.close();

        List<String> result = filterStrings(strings, minLength);

        System.out.println("Исходный список:");
        System.out.println(strings);
        System.out.println("Список строк с длиной больше " + minLength + ":");
        System.out.println(result);
    }

    public static List<String> filterStrings(List<String> strings, int minLength) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > minLength) {
                result.add(string);
            }
        }
        return result;
    }
}