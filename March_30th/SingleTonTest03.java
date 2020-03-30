package March_30th;

public class SingleTonTest03 {
    /**
     * 线程安全的懒汉式单例模式
     * @param args
     */
    public static void main(String[] args) {
        SingleTon03.getInstance();
    }

}
class SingleTon03{
    private SingleTon03(){

    }
    private static SingleTon03 instance;

    public static synchronized SingleTon03 getInstance(){
        if(instance == null){
            instance = new SingleTon03();
        }
        return instance;
    }
}
