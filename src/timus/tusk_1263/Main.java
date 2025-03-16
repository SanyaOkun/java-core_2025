package timus.tusk_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();

        int[] votes = new int[n];

        for (int i = 0; i < m; i++) {
            int candidate = in.nextInt();
            votes[candidate - 1]++;
        }
        in.close();

        for (int i = 0; i < n; i++) {
            double percentage = ((double) votes[i] / m) * 100;
            System.out.printf("%.2f%%\n", percentage);
        }
    }
}