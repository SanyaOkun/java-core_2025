package timus.tusk_2056;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = in.nextInt();
        }

        boolean hasThree = false;
        boolean allFives = true;
        double sum = 0;

        for (int mark : marks) {
            if (mark == 3) {
                hasThree = true;
            }
            if (mark!= 5) {
                allFives = false;
            }
            sum += mark;
        }

        if (hasThree) {
            System.out.println("None");
        } else if (allFives) {
            System.out.println("Named");
        } else if (sum / n >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
        in.close();
    }
}