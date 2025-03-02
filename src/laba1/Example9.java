package laba1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String month = in.nextLine();

        System.out.print("Введите количество дней в месяце: ");
        int days = in.nextInt();

        String dayString = getDayString(days);

        System.out.println("Месяц " + month + " содержит " + days + " " + dayString + ".");

        in.close();
    }

    public static String getDayString(int days) {
        if (days % 10 == 1 && days % 100!= 11) {
            return "день";
        } else if (days % 10 >= 2 && days % 10 <= 4 && (days % 100 < 10 || days % 100 >= 20)) {
            return "дня";
        } else {
            return "дней";
        }
    }
}
