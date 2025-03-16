package timus.tusk_1025;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int[] groups = new int[k];

        for (int i = 0; i < k; i++) {
            groups[i] = in.nextInt();
        }

        in.close();

        Arrays.sort(groups);

        int result = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            int voters = (groups[i] + 1) / 2;
            result += voters;
            count++;

            if (count > k / 2) {
                break;
            }
        }

        System.out.println(result);
    }
}
