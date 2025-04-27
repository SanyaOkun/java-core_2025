package timus.tusk_1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        if (N == 0) {
            System.out.println(10);
            return;
        }

        if (N == 1) {
            System.out.println(1);
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 9; i >= 2; i--) {
            while (N % i == 0) {
                result.append(i);
                N /= i;
            }
        }

        if (N > 1) {
            System.out.println(-1);
        } else {
            System.out.println(result.reverse().toString());
        }
    }
}