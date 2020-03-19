package March_19th;

import java.util.ArrayList;
import java.util.Comparator;

public class Test4 {
    /**
     * 在一个列表中存储以下元素：apple,grape,banana,pear
     *   返回集合中的最大的和最小的元素
     *   将集合进行排序，并将排序后的结果打印在控制台上
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("grape");
        arrayList.add("banana");
        arrayList.add("pear");
        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("最大的是");
        System.out.println(arrayList.get(0));
        System.out.println("最小的是");
        System.out.println(arrayList.get(3));
        System.out.println("排序结果");
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
