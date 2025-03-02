package timus.tusk_1319;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 1;
        int[][] matrix = new int[n][n];

        for (int k = 0; k < 2 * n - 1; k++) {
            for (int i = 0; i < n; i++) {
                int j = k - i;
                if (j >= 0 && j < n) {
                    matrix[i][n - 1 - j] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}