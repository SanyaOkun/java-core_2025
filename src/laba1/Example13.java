package laba1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();

        double sum = num1 + num2;

        System.out.println("Сумма двух чисел: " + num1 + " + " + num2 + " = " + sum);

        in.close();
    }
}
