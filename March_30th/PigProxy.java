package March_30th;

public class PigProxy implements Eat {
    /**
     * 静态代理的代理类
     */

    private  Eat SomeOneIsEating;//通过接口实现代理类和被代理类的聚合

    public PigProxy(Eat SomeOneIsEating){
        this.SomeOneIsEating = SomeOneIsEating;
    }
    @Override
    public void eat() {
        System.out.println("代理开始。。。");
        System.out.println("正在检查猪食。。。");
        SomeOneIsEating.eat();
        System.out.println("收拾中。。。");
        System.out.println("代理结束。。。");
    }
}
