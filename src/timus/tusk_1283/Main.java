package timus.tusk_1283;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gold = in.nextDouble();
        double threshold = in.nextDouble();
        double commission = in.nextDouble();
        int years = 0;
        while (gold > threshold) {
            gold = gold * (1 - commission / 100);
            years++;
        }
        System.out.println(years);
    }
}