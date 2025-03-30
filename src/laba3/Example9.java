package laba3;

import java.util.HashMap;

public class Example9 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Заполнить HashMap 10 объектами
        map.put(0, "Apple");
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Pear");
        map.put(4, "Grape");
        map.put(5, "Kiwi");
        map.put(6, "Mango");
        map.put(7, "Pineapple");
        map.put(8, "Peach");
        map.put(9, "Apricot");

        // Найти строки у которых ключ > 5
        System.out.println("Строки у которых ключ > 5:");
        for (Integer key : map.keySet()) {
            if (key > 5) {
                System.out.println(key + ": " + map.get(key));
            }
        }

        // Если ключ = 0, вывести строки через запятую
        if (map.containsKey(0)) {
            System.out.println("Строки через запятую для ключа 0:");
            System.out.println(map.get(0));
        }

        // Перемножить все ключи, где длина строки > 5
        int product = 1;
        for (Integer key : map.keySet()) {
            if (map.get(key).length() > 5) {
                product *= key;
            }
        }
        System.out.println("Произведение ключей, где длина строки > 5: " + product);
    }
}
