package March_30th;


public class CglibProxyTest {
    /**
     * cglib代理测试类
     * @param args
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat proxyInstance = (Cat)new CglibCatProxy(cat).getProxyInstance();
        proxyInstance.eat();
    }
}
