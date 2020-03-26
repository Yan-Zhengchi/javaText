package March_26th;

import java.util.concurrent.locks.ReentrantLock;

public class Account {

    public static int count = 1000;
    public static ReentrantLock lock = new ReentrantLock();
}
