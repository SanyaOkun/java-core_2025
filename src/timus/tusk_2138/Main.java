package timus.tusk_2138;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        long v = Long.parseLong(sc.nextLine());

        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = (int)(v % 256);
            v /= 256;
        }

        long result = 0;
        for (int i = 0; i < 4; i++) {
            result = result * 256 + digits[3 - i];
        }

        System.out.println(result);
    }
}

