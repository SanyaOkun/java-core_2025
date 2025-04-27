package timus.tusk_2142;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long A = in.nextLong();
        long B = in.nextLong();
        long C = in.nextLong();

        long X = in.nextLong();
        long Y = in.nextLong();
        long Z = in.nextLong();

        long redMana = A + C;
        long blueMana = B + C;

        if (redMana >= X && blueMana >= Y && (A + B + C) >= (X + Y + Z)) {
            System.out.println("It is a kind of magic");
        } else {
            System.out.println("There are no miracles in life");
        }

        in.close();
    }
}
