package March_26th;

public class B extends Account implements Runnable {
    int money = 0;
    private boolean exit = false;

    @Override
    public void run() {

        while (!exit) {
            Account.lock.lock();
            if (Account.count <100) {
                exit = true;
            }else {
                System.out.println(Thread.currentThread().getName() + "在ATM取走了100元");
                money += 100;
                System.out.println(Thread.currentThread().getName() + "现在的钱数为：" + money);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Account.count -= 100;
            }

            Account.lock.unlock();
        }
    }
}
