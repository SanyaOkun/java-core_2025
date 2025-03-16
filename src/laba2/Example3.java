package laba2;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.println("Введите ключ: ");
        int key = in.nextInt();
        in.nextLine();

        StringBuilder Text = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                char encryptedChar = (char) ((c - 'a' + key) % 26 + 'a');
                Text.append(encryptedChar);
            } else if (c >= 'A' && c <= 'Z') {
                char encryptedChar = (char) ((c - 'A' + key) % 26 + 'A');
                Text.append(encryptedChar);
            } else {
                Text.append(c);
            }
        }

        System.out.println("Текст после преобразования: " + Text.toString());

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = in.nextLine();

        while (!answer.equalsIgnoreCase("y") &&!answer.equalsIgnoreCase("n")) {
            System.out.println("Введите корректный ответ");
            answer = in.nextLine();
        }

        if (answer.equalsIgnoreCase("y")) {
            StringBuilder decryptedText = new StringBuilder();

            for (char c : Text.toString().toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    char decryptedChar = (char) ((c - 'a' - key + 26) % 26 + 'a');
                    decryptedText.append(decryptedChar);
                } else if (c >= 'A' && c <= 'Z') {
                    char decryptedChar = (char) ((c - 'A' - key + 26) % 26 + 'A');
                    decryptedText.append(decryptedChar);
                } else {
                    decryptedText.append(c);
                }
            }

            System.out.println("Текст после обратного преобразования: " + decryptedText.toString());
        } else {
            System.out.println("До свидания!");
        }
    }
}
