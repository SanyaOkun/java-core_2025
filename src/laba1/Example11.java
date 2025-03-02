package laba1;
import java.util.Scanner;
import java.util.Calendar;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите ваш год рождения: ");
        int birthYear = in.nextInt();

        Calendar Date = Calendar.getInstance();

        int age = Date.get(Calendar.YEAR) - birthYear;

        String ageString = getAgeString(age);

        System.out.println("Здравствуйте, " + name + "! Вам " + age + " " + ageString + ".");

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
