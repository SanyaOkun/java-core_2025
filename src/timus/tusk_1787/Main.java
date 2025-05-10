package timus.tusk_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int waiting = 0;
        for (int i = 0; i < n; i++) {
            int arrived = in.nextInt();
            waiting += arrived;
            waiting -= k;
            if (waiting < 0) {
                waiting = 0;
            }
        }
        System.out.println(waiting);
        in.close();
    }
}

