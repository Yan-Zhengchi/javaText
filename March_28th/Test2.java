package March_28th;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
    /**
     * 有四个线程,其中A,B线程对i加1操作，C,D线程每次对i减1操作
     */
    public static void main(String[] args) {
        Thread a = new Thread(new RunnableImpl(),"A");
        Thread b = new Thread(new RunnableImpl(),"B");
        Thread c = new Thread(new RunnableImpl(),"C");
        Thread d = new Thread(new RunnableImpl(),"D");
        a.start();
        b.start();
        c.start();
        d.start();

    }
}

