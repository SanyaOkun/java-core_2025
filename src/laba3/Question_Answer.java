package laba3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question_Answer {
    public static void main(String[] args) {
        // Пример 1: Сортировка с помощью Collections.sort()
        System.out.println("Пример 1: Сортировка с помощью Collections.sort()");
        List<String> list1 = new ArrayList<>();
        list1.add("banana");
        list1.add("apple");
        list1.add("cherry");
        System.out.println("До сортировки: " + list1);
        Collections.sort(list1);
        System.out.println("После сортировки: " + list1);

        System.out.println();

        // Пример 2: Сортировка с помощью Comparator
        System.out.println("Пример 2: Сортировка с помощью Comparator");
        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("apple");
        list2.add("cherry");
        System.out.println("До сортировки: " + list2);
        Collections.sort(list2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("После сортировки: " + list2);

        System.out.println();

        // Пример 3: Сортировка с помощью лямбда-выражения
        System.out.println("Пример 3: Сортировка с помощью лямбда-выражения");
        List<String> list3 = new ArrayList<>();
        list3.add("banana");
        list3.add("apple");
        list3.add("cherry");
        System.out.println("До сортировки: " + list3);
        Collections.sort(list3, (o1, o2) -> o1.compareTo(o2));
        System.out.println("После сортировки: " + list3);

        System.out.println();

        // Пример 4: Сортировка с помощью метода stream().sorted()
        System.out.println("Пример 4: Сортировка с помощью метода stream().sorted()");
        List<String> list4 = new ArrayList<>();
        list4.add("banana");
        list4.add("apple");
        list4.add("cherry");
        System.out.println("До сортировки: " + list4);
        list4 = list4.stream()
                .sorted()
                .toList();
        System.out.println("После сортировки: " + list4);
    }
}