package laba3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        inputArray(array, 0, in);

        System.out.println("Введенный массив:");
        outputArray(array, 0);

        in.close();
    }

    public static void inputArray(int[] array, int index, Scanner in) {
        if (index == array.length) {
            return;
        } else {
            System.out.println("Введите элемент " + (index + 1));
            array[index] = in.nextInt();
            inputArray(array, index + 1, in);
        }
    }

    public static void outputArray(int[] array, int index) {
        if (index == array.length) {
            return;
        } else {
            System.out.print(array[index] + " ");
            outputArray(array, index + 1);
        }
    }
}
