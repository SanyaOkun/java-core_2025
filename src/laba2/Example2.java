package laba2;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Запрашиваем размерность массива у пользователя
        System.out.println("Введите количество строк: ");
        int rows = in.nextInt();
        System.out.println("Введите количество столбцов: ");
        int cols = in.nextInt();

        // Создаем массив указанной размерности
        int[][] nums = new int[rows][cols];
        int value = 1;

        // Заполняем массив "змейкой"
        boolean direction = true; // true - слева направо, false - справа налево
        for (int i = 0; i < rows; i++) {
            if (direction) {
                for (int j = 0; j < cols; j++) {
                    nums[i][j] = value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    nums[i][j] = value++;
                }
            }
            direction =!direction;
        }

        // Выводим массив в консоль
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%2d ", nums[i][j]);
            }
            System.out.println();
        }
    }
}
