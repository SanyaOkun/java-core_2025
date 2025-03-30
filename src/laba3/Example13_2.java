package laba3;

import java.util.*;

public class Example13_2 {
    public static void main(String[] args) {
        int n = 5000; // 5 000 элементов

        Deque<Integer> arrayDeque = new ArrayDeque<>();
        List<Integer> arrayList = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();

        System.out.println("Таблица 2. Сравнение времени выполнения операции удаления");
        System.out.println("Коллекция\tв начале коллекции\tв середине коллекции\tв конце коллекции");
        System.out.println("ArrayDeque\t" + getRunningTimeRemoveFirst(arrayDeque, n) + "\t" + getRunningTimeRemoveMiddle(arrayDeque, n) + "\t" + getRunningTimeRemoveLast(arrayDeque, n));
        System.out.println("ArrayList\t" + getRunningTimeRemoveFirst(arrayList, n) + "\t" + getRunningTimeRemoveMiddle(arrayList, n) + "\t" + getRunningTimeRemoveLast(arrayList, n));
        System.out.println("SortedSet\t" + getRunningTimeRemoveFirst(sortedSet, n) + "\t" + getRunningTimeRemoveMiddle(sortedSet, n) + "\t" + getRunningTimeRemoveLast(sortedSet, n));
    }

    private static long getRunningTimeRemoveFirst(Deque<Integer> deque, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            deque.add(i);
        }
        for (int i = 0; i < n; i++) {
            deque.removeFirst();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveMiddle(Deque<Integer> deque, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            deque.add(i);
        }
        for (int i = 0; i < n; i++) {
            deque.remove(deque.size() / 2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveLast(Deque<Integer> deque, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            deque.add(i);
        }
        for (int i = 0; i < n; i++) {
            deque.removeLast();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveFirst(List<Integer> list, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        for (int i = 0; i < n; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveMiddle(List<Integer> list, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        for (int i = 0; i < n; i++) {
            list.remove(list.size() / 2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveLast(List<Integer> list, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        for (int i = 0; i < n; i++) {
            list.remove(list.size() - 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveFirst(SortedSet<Integer> set, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
        for (int i = 0; i < n; i++) {
            set.remove(set.first());
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveMiddle(SortedSet<Integer> set, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
        for (int i = 0; i < n; i++) {
            Integer[] array = set.toArray(new Integer[0]);
            set.remove(array[array.length / 2]);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveLast(SortedSet<Integer> set, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
        for (int i = 0; i < n; i++) {
            set.remove(set.last());
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
