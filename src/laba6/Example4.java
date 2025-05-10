package laba6;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Thread-" + threadNumber);
            });
            thread.start();
            thread.join();
        }
    }
}
