package laba3;
import java.util.*;

public class Example13_1 {
    public static void main(String[] args) {
        int n = 5000; // 5 000 элементов

        Deque<Integer> arrayDeque = new ArrayDeque<>();
        List<Integer> arrayList = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();

        System.out.println("Таблица 1. Сравнение времени выполнения операции добавления");
        System.out.println("Коллекция\tв начало коллекции\tв середину коллекции\tв конец коллекции");
        System.out.println("ArrayDeque\t" + getRunningTimeAddFirst(arrayDeque, n) + "\t" + getRunningTimeAddMiddle(arrayDeque, n) + "\t" + getRunningTimeAddLast(arrayDeque, n));
        System.out.println("ArrayList\t" + getRunningTimeAddFirst(arrayList, n) + "\t" + getRunningTimeAddMiddle(arrayList, n) + "\t" + getRunningTimeAddLast(arrayList, n));
        System.out.println("SortedSet\t" + getRunningTimeAddFirst(sortedSet, n) + "\t" + getRunningTimeAddMiddle(sortedSet, n) + "\t" + getRunningTimeAddLast(sortedSet, n));
    }

    private static long getRunningTimeAddFirst(Deque<Integer> deque, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n / 100; i++) {
            for (int j = 0; j < 100; j++) {
                deque.addFirst(i * 100 + j);
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddMiddle(Deque<Integer> deque, int n) {
        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n / 100; i++) {
            for (int j = 0; j < 100; j++) {
                list.add(list.size() / 2, i * 100 + j);
            }
        }
        deque.addAll(list);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddLast(Deque<Integer> deque, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n / 100; i++) {
            for (int j = 0; j < 100; j++) {
                deque.addLast(i * 100 + j);
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddFirst(List<Integer> list, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n / 100; i++) {
            for (int j = 0; j < 100; j++) {
                list.add(0, i * 100 + j);
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddMiddle(List<Integer> list, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n / 100; i++) {
            for (int j = 0; j < 100; j++) {
                list.add(list.size() / 2, i * 100 + j);
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddLast(List<Integer> list, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n / 100; i++) {
            for (int j = 0; j < 100; j++) {
                list.add(i * 100 + j);
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddFirst(SortedSet<Integer> set, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n / 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (set.isEmpty()) {
                    set.add(i * 100 + j);
                } else {
                    int first = set.first();
                    set.add(first - 1);
                }
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddMiddle(SortedSet<Integer> set, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n / 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (set.isEmpty()) {
                    set.add(i * 100 + j);
                } else {
                    int[] array = set.stream().mapToInt(x -> x).toArray();
                    int middle = array[array.length / 2];
                    set.add(middle - 1);
                }
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddLast(SortedSet<Integer> set, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n / 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (set.isEmpty()) {
                    set.add(i * 100 + j);
                } else {
                    int last = set.last();
                    set.add(last + 1);
                }
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}