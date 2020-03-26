package March_26th;

public class BankTest {
    /**
     * 模拟 一个账户 1000块钱 :
     * 两个人 A B 分别在柜台和ATM机 取钱 A每次取钱100 B每次取200 最终在控制台输出每个人取钱数
     */
    public static void main(String[] args) {
        Account account = new Account();
        Thread a = new Thread(new A(), "A");
        Thread b = new Thread(new B(), "B");
        a.start();
        b.start();
       

    }
}
