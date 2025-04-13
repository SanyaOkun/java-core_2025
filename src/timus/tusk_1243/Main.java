package timus.tusk_1243;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long belosnejka = 0;
        for (char c : s.toCharArray()) {
            belosnejka = (belosnejka * 10 + c - '0') % 7;
        }
        System.out.println(belosnejka);
        in.close();
    }
}
