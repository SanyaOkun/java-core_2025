package laba1;
import java.util.Scanner;
import java.util.Calendar;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        Calendar Date = Calendar.getInstance();

        int birthYear = Date.get(Calendar.YEAR) - age;

        String ageString = getAgeString(age);

        System.out.println("Если вам, " + age + " " + ageString + ", то ваш год рождения: " + birthYear + ".");

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
