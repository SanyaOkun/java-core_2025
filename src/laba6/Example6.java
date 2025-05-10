package laba6;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Example6 {
    public static final Object lock = new Object();
    private static int sum = 0;

    public static void sumElements(int[] array) throws InterruptedException {
        int numCores = 4;
        int chunkSize = array.length / numCores;

        Thread[] threads = new Thread[numCores];
        CountDownLatch latch = new CountDownLatch(numCores);

        for (int i = 0; i < numCores; i++) {
            int start = i * chunkSize;
            int end = (i == numCores - 1)? array.length : (i + 1) * chunkSize;
            final int threadId = i;
            threads[i] = new Thread(() -> {
                int localSum = 0;
                System.out.println("Thread-" + threadId + " started");
                for (int j = start; j < end; j++) {
                    localSum += array[j];
                }
                System.out.println("Thread-" + threadId + " finished");
                synchronized (lock) {
                    sum += localSum;
                }
                latch.countDown();
            });
            threads[i].start();
        }

        latch.await();
    }

    public static int getSum() {
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        sumElements(array);
        System.out.println("Сумма элементов: " + getSum());
    }
}