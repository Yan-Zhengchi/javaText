package March_30th;

public class SingleTonTest02 {
    /**
     * 线程不安全的懒汉式单例模式
     * @param args
     */
    public static void main(String[] args) {
        SingleTon02.getInstance();
    }
}

class SingleTon02{
    private SingleTon02(){

    }

    private static SingleTon02 instance;

    public static SingleTon02 getInstance(){
        if(instance==null){
            instance = new SingleTon02();
        }
        return instance;
    }
}
