package timus.tusk_1496;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // считываем пустую строку

        Map<String, Integer> submitCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String teamName = in.nextLine();
            submitCount.put(teamName, submitCount.getOrDefault(teamName, 0) + 1);
        }
        in.close();

        for (Map.Entry<String, Integer> entry : submitCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}