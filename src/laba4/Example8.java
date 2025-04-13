package laba4;

public class Example8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (Exception e){
            System.out.println("2");
        } finally {
            System.out.println("1");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
