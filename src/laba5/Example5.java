package laba5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example5 {
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

        System.out.println("Введите подстроку для поиска:");
        String substring = in.nextLine();

        List<String> result = filterStrings(strings, substring);

        System.out.println("Исходный список:");
        System.out.println(strings);
        System.out.println("Список строк, содержащих подстроку '" + substring + "':");
        System.out.println(result);
        in.close();
    }

    public static List<String> filterStrings(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (string.contains(substring)) {
                result.add(string);
            }
        }
        return result;
    }
}