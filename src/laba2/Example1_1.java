package laba2;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Example1_1 {
    public static void main(String[] args) {
        // Запрашиваем размер массива у пользователя
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        System.out.println("Размер массива равен: "+size);
        // Создаем массив указанного размера
        int[] nums = new int[size];
        // Заполняем массив случайными числами
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        //Сортировка массива по возрастанию его элементов
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        // Выводим массив в консоль
        System.out.println("Массив:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Находим элемент с минимальным значением
        int minIndex = 0;
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
                minIndex = i;
            } else if (nums[i] == minValue) {
                System.out.println("Элемент с минимальным значением " + minValue + " найден еще раз в индексе " + i);
            }
        }

        // Выводим значение элемента с минимальным значением и его индекс
        System.out.println("Элемент с минимальным значением: " + minValue);
        System.out.println("Индекс элемента с минимальным значением: " + minIndex);
    }
}
