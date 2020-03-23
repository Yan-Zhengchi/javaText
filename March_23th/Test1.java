package March_23th;

import java.util.List;

public class Test1 {
    /**
     * 1
     * 定义一个User类  Integer id   String name
     * 定义一个测试类 分别对上述方法进行测试
     */
    public static void main(String[] args) {
        Dao<User> test = new Dao<>();
        test.save("1",new User(20000,"张三"));
        test.save("2",new User(20001,"张四"));
        test.save("3",new User(20002,"张五"));
        test.save("4",new User(20003,"张六"));
        test.save("5",new User(20004,"张七"));
        test.save("6",new User(20005,"张八"));
        System.out.println(test.get("5"));
        test.update("1",new User(99999,"闫正驰"));
        test.delete("3");
        List<User> list = test.list();
        for (User user : list) {
            System.out.println("user id = "+user.id+"    user name = "+user.name);
        }
    }
}
