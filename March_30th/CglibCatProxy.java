package March_30th;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibCatProxy implements MethodInterceptor {
    /**
     * cglib代理类
     */
    private Object target;
    public CglibCatProxy(Object target){
        this.target = target;
    }
    public Object getProxyInstance(){
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //返回子类对象（代理对象）
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib代理开始执行");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib代理结束执行");
        return invoke;
    }
}
