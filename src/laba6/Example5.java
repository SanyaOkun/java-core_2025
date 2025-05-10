package laba6;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Example5 {
    public static final Object lock = new Object();
    private static int maxElement = Integer.MIN_VALUE;

    public static void findMaxElement(int[] array) throws InterruptedException {
        int numCores = 4;
        int chunkSize = array.length / numCores;

        Thread[] threads = new Thread[numCores];
        CountDownLatch latch = new CountDownLatch(numCores);

        for (int i = 0; i < numCores; i++) {
            int start = i * chunkSize;
            int end = (i == numCores - 1)? array.length : (i + 1) * chunkSize;
            final int threadId = i;
            threads[i] = new Thread(() -> {
                int localMax = Integer.MIN_VALUE;
                System.out.println("Thread-" + threadId + " started");
                for (int j = start; j < end; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }
                System.out.println("Thread-" + threadId + " finished");
                synchronized (lock) {
                    if (localMax > maxElement) {
                        maxElement = localMax;
                    }
                }
                latch.countDown();
            });
            threads[i].start();
        }

        latch.await();
    }

    public static int getMaxElement() {
        return maxElement;
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
        findMaxElement(array);
        System.out.println("Максимальный элемент: " + getMaxElement());
    }
}