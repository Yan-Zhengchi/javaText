package March_23th;

import java.util.*;

public class Dao<T> {
    /**
     * 定义一个泛型Dao<T>，在其中顶一个Map成员变量,Map的键为String类型，值为T类型
     *      * 分别创建以下方法:
     *      * public void save(String id,T entity) 保存T乐行的对象到map集合中
     *      * public T get(String id) 从map中获取id对应的对象
     *      * public  void update(String id,T entity) 替换map中的key为id的内容
     *      * public List<T> list()  返回map中所有的 T 对象
     *      * public  void delete(String id) 删除指定对象
     *      *
     *      *
     */
    private Map<String,T> map;

    public Dao() {
        this.map = new HashMap<>();
    }

    public void save(String id, T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        Set<String> strings = map.keySet();
        String temp = "";
        for (String string : strings) {
            if(id.equals(string)){
                temp = string;
            }
        }
        map.replace(temp,entity);
    }
    public List<T> list(){
        Set<String> strings = map.keySet();
        ArrayList<T> list = new ArrayList<>();
        for (String string : strings) {
            list.add(map.get(string));
        }
        return list;
    }
    public void delete(String id){
        Set<String> strings = map.keySet();
        String temp = "";
        for (String string : strings) {
            if(id.equals(string)){
                temp = string;
            }
        }
        map.remove(temp);
    }
}
