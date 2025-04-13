package timus.tusk_1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] w = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
            sum += w[i];
        }
        boolean[] dp = new boolean[sum / 2 + 1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = sum / 2; j >= w[i]; j--) {
                if (dp[j - w[i]]) {
                    dp[j] = true;
                }
            }
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = sum / 2; i >= 0; i--) {
            if (dp[i]) {
                minDiff = Math.min(minDiff, sum - 2 * i);
            }
        }
        System.out.println(minDiff);
        in.close();
    }
}