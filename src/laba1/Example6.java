package laba1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        String lastName = in.nextLine();

        System.out.print("Введите имя: ");
        String firstName = in.nextLine();

        System.out.print("Введите отчество: ");
        String patronymic = in.nextLine();

        System.out.println("Hello, " + lastName + " " + firstName + " " + patronymic);

        in.close();
    }
}
