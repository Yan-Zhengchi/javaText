package March_26th;

import static java.lang.Thread.sleep;

public class A extends Account implements Runnable {
    public int money = 0;
    public boolean exit = false;
    @Override
    public void run() {

        while (!exit) {
            Account.lock.lock();
            if(Account.count<200) {
                exit = true;
            }else{
                System.out.println(Thread.currentThread().getName() + "在柜台取走了200元");
                money += 200;
                System.out.println(Thread.currentThread().getName() + "现在的钱数为：" + money);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Account.count -= 200;
           }

            Account.lock.unlock();
        }
    }
}
