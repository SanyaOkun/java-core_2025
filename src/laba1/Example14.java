package laba1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        int num1 = num - 1;
        int num2 = num + 1;

        int sum = num1 + num + num2;
        int sqr = sum * sum;

        System.out.println("Последовательность чисел: " + num1 + ", " + num + ", " + num2 + ", " + sqr);

        in.close();
    }
}
