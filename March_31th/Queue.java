package March_31th;

import java.util.LinkedList;

public class Queue {
    /**
     * 请使用LinkedList来模拟一个队列(先进先出的特性)
     * 3.1 拥有放入对象的方法void put(Object o)
     * 3.2 取出对象的方法Object get()
     * 3.3 判断队列当中是否为空的方法booleanisEmpty()；并且，编写测试代码，验证你的队列是否正确？
     */
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.put("小王");
        queue.put("小李");
        queue.put("小红");
        queue.put("小绿");
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.isEmpty());
    }
    private LinkedList<Object> list = new LinkedList<>();
    public void put(Object o){
        list.addLast(o);
    }
    public Object get(){
        Object temp = list.getFirst();
        list.removeFirst();
        return temp;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
