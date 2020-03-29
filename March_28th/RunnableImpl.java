package March_28th;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable{
    private int i = 0;
   Lock lock =  new ReentrantLock();

    @Override
    public void run() {
        for (int j = 0; j <3 ; j++) {
            lock.lock();
            if(Thread.currentThread().getName().equals("A")||Thread.currentThread().getName().equals("B")){
                i++;
                System.out.println(Thread.currentThread().getName()+"   i="+i);
            }
            if(Thread.currentThread().getName().equals("C")||Thread.currentThread().getName().equals("D")){
                i--;
                System.out.println(Thread.currentThread().getName()+"   i="+i);
            }
            lock.unlock();
        }

    }
}
