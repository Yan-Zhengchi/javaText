package March_19th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test4 {
    /**
     * 在一个列表中存储以下元素：apple,grape,banana,pear
     *   返回集合中的最大的和最小的元素
     *   将集合进行排序，并将排序后的结果打印在控制台上
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("pear");
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println("最大的是");
        System.out.println(list.get(3));
        System.out.println("最小的是");
        System.out.println(list.get(0));
        System.out.println("排序结果");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
