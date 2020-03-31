package March_31th;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    /**
     * 选择合适的Map集合保存5位学员的学号和姓名，然后按学号的自然顺序的倒序将这些键值对一一打印出来
     */
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });
        treeMap.put("1000005","张三");
        treeMap.put("1000009","李四");
        treeMap.put("1000004","王五");
        treeMap.put("1000001","赵六");
        treeMap.put("1000003","验证吃");
        Set<String> strings = treeMap.keySet();
        for (String string : strings) {
            System.out.println(string);
        }
    }

}
