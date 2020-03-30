package March_30th;

public class ProxyTest {
    /**
     * 静态代理测试类
     * @param args
     */
    public static void main(String[] args) {
        Pig pig = new Pig();
        PigProxy pigProxy = new PigProxy(pig);
        pigProxy.eat();
    }
}
