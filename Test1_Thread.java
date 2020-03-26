package March_26th;

public class Test1_Thread extends Thread {

    @Override
    public void run() {

        while (Test1.count < 400) {
            synchronized (Test1.class) {
                if (Test1.count % 2 == 1) {
                    System.out.println(Thread.currentThread().getName());
                    //Test1.count++;
                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                if (Test1.count % 2 == 0) {
                    System.out.println(Test1.count);
                    //Test1.count++;
                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Test1.count++;
            }
        }
    }
}
