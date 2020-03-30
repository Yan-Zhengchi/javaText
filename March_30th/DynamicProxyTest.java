package March_30th;

public class DynamicProxyTest {
    /**
     * 动态代理测试类
     */
    public static void main(String[] args) {
        Pig pig = new Pig();
        Eat proxyInstance =(Eat) new DynamicPigProxy(pig).getProxyInstance();
        proxyInstance.eat();
    }
}
