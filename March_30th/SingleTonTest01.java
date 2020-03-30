package March_30th;

public class SingleTonTest01 {
    /**
     * 饿汉式单例模式
     */
    public static void main(String[] args) {
        SingleTon01.getInstance();
    }
}

class SingleTon01{
    private SingleTon01(){

    }
    private static SingleTon01 instance;
    static{
        instance = new SingleTon01();
    }
    public static SingleTon01 getInstance(){
        return instance;
    }
}