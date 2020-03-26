package March_26th;

public class Test1 {
    /**
     * 1.有三个线程,输出200到400之间所有的数据,如果是奇数那么就输出当前线程的名称
     */
    public static int count = 200;
    public static void main(String[] args) {
        Test1_Thread thread1 = new Test1_Thread();
        Test1_Thread thread2=  new Test1_Thread();
        Test1_Thread thread3=  new Test1_Thread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
