package timus.tusk_1567;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Map<Character, Integer> cost = new HashMap<>();

        String[] keys = {
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqr",
                "stu",
                "vwx",
                "yz"
        };

        for (int i = 0; i < 9; i++) {
            String group = keys[i];
            for (int j = 0; j < group.length(); j++) {
                cost.put(group.charAt(j), j + 1);
            }
        }

        cost.put('.', 1);
        cost.put(',', 2);
        cost.put('!', 3);
        cost.put(' ', 1);

        int sum = 0;
        for (char c : text.toCharArray()) {
            sum += cost.getOrDefault(c, 0);
        }

        System.out.println(sum);
    }
}

