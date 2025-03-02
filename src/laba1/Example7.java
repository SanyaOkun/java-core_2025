package laba1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        String ageString = getAgeString(age);

        System.out.println("Вас зовут " + name + " и вам " + age + " " + ageString + ".");

        in.close();
    }

    public static String getAgeString(int age) {
        if (age % 10 == 1 && age % 100!= 11) {
            return "год";
        } else if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 10 || age % 100 >= 20)) {
            return "года";
        } else {
            return "лет";
        }
    }
}
