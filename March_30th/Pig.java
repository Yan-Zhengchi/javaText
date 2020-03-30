package March_30th;

public class Pig implements Eat{
    /**
     * 静态代理的目标类（委托类）
     */
    @Override
    public void eat() {
        System.out.println("猪正在吃食物。。。。。。");
    }
}
