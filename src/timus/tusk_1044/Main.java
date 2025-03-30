package timus.tusk_1044;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int half = n / 2;
        int[] sums = new int[46]; // максимальная сумма 9*4 = 36
        sums[0] = 1;
        for (int i = 0; i < half; i++) {
            int[] newSums = new int[46];
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 46; k++) {
                    if (k + j < 46) {
                        newSums[k + j] += sums[k];
                    }
                }
            }
            sums = newSums;
        }
        int count = 0;
        for (int i = 0; i < 46; i++) {
            count += sums[i] * sums[i];
        }
        System.out.println(count);
    }
}
