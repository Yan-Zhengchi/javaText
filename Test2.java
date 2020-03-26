package March_26th;

public class Test2 {
    /**
     * 现在有一个旅行队10个人,探险进入一线天,这个一线天每次只能过一个人,
     * 每个人过的时间是20秒,现在10个人通过该一线天,请输出每个人经过一线天的顺序和姓名
     */
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            new Thread(new Test2_Thread(),("旅行者"+i)).start();
        }
    }
}
