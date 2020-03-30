package March_30th;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicPigProxy {
    /**
     * 动态代理的代理类
     */
    Object target;
    public DynamicPigProxy(Object target){
        this.target = target;
    }
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("动态代理类开始代理。。。");
                        Object invoke = method.invoke(target, objects);
                        System.out.println("动态代理类结束代理。。。");
                        return invoke;
                    }
                }
        );
    }
}
