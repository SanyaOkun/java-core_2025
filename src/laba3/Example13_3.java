package laba3;

import java.util.*;

public class Example13_3 {
    public static void main(String[] args) {
        int n = 5000000; // 5 000 000 элементов

        Deque<Integer> arrayDeque = new ArrayDeque<>();
        List<Integer> arrayList = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();

        System.out.println("Сравнение времени выполнения операции получения элемента по индексу");
        System.out.println("Коллекция\tПо индексу для <n> элементов");
        System.out.println("ArrayDeque\t" + getRunningTimeGetByIndex(arrayDeque, n));
        System.out.println("ArrayList\t" + getRunningTimeGetByIndex(arrayList, n));
        System.out.println("SortedSet\t" + getRunningTimeGetByIndex(sortedSet, n));
    }

    private static long getRunningTimeGetByIndex(Deque<Integer> deque, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            deque.add(i);
        }
        Integer[] array = deque.toArray(new Integer[0]);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeGetByIndex(List<Integer> list, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        for (int i = 0; i < n; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeGetByIndex(SortedSet<Integer> set, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
        Integer[] array = set.toArray(new Integer[0]);
        for (int i = 0; i < n; i++) {
            int value = array[i];
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}