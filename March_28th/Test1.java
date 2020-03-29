package March_28th;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    /**
     * 现在有三个线程,如何保持三个线程按照顺序执行
     */
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        Thread threadA = new Thread(() -> System.out.println("线程a在执行"));
        Thread threadB = new Thread(() -> System.out.println("线程b在执行"));
        Thread threadC = new Thread(() -> System.out.println("线程c在执行"));

        while (true) {
            try {
                threadPool.submit(threadA);
                Thread.sleep(500);
                threadPool.submit(threadB);
                Thread.sleep(500);
                threadPool.submit(threadC);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

