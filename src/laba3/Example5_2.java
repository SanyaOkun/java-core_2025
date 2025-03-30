package laba3;

public class Example5_2 {
    public static void main(String[] args) {
        System.out.println(fact(5, 0));
    }

    public static int fact(int n, int level) {
        System.out.println(getIndent(level) + "fact(" + n + ")");
        if (n == 0 || n == 1) {
            System.out.println(getIndent(level) + "=> " + n);
            return n;
        } else {
            int result = fact(n - 2, level + 1) + fact(n - 1, level + 1);
            System.out.println(getIndent(level) + "=> " + result);
            return result;
        }
    }

    private static String getIndent(int level) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indent.append("  ");
        }
        return indent.toString();
    }
}
