package March_19th;

import java.util.HashSet;
import java.util.Random;

public class Test5 {
    /**
     * 产生10个1~20之间的随机数，要求随机数不能重复
     */
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        while(integers.size()<10){
            integers.add(new Random().nextInt(20)+1);
        }
        for (Integer integer : integers) {
            System.out.print(integer+"   ");
        }
    }

}
