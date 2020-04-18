import java.util.*;

public class Test2 {
    /**
     * 循环输入10个数(50以内),统计每个数出现的次数
     */
    public static void main(String[] args) {
        //定义数组长度为10
        int[] arr = new int[10];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            //从控制台接收数组长度个int形数，并赋给数组
            Scanner scanner = new Scanner(System.in);
            arr[i] = scanner.nextInt();
        }
        for (int i:arr
             ) {
            //将数据依次存入HashSet，目的是获取不重复数据的集合
            hashSet.add(i);
        }
        //遍历hashSet
        for (int i:hashSet
             ) {
            //定义数据出现次数sum
            int sum = 0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[j] == i){
                    //记录set中的数据如果在数组中出现一次，就将出现次数sum++
                    sum++;
                }
            }
            //将set中的数据对应的出现次数用map键值对记录
            hashMap.put(i,sum);
        }
        //将map中的key全部导出到一个set集合，遍历map中的key和set
        Set<Integer> keySet = hashMap.keySet();
        for (int i:keySet
             ) {
            System.out.println(i+"出现了"+hashMap.get(i)+"次");
        }


    }
}
