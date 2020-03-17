package March_17th;

import java.util.Scanner;

public class Test3 {
    /**
     * 编写一个计算N个整数平均值的程序。程序应该提示用户输入N的值，如何必须输入所有N个数。
     * 如果用户输入的值是一个负数，则应该抛出一个异常并捕获，提示“N必须是正数或者0”。并提示用户再次输入该数
     */
    public static void main(String[] args) {
        int n = 0;
        System.out.println("请输入接下来要输入几个整数：");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        int[] ints = new int[n];
        System.out.println("请依次输入每个值：");
        try {
            for (int i = 0; i < n; i++) {
                ints[i] = scanner.nextInt();
                if(ints[i]<0){
                    throw new Exception("N必须是正数或者0");
                }
            }
            System.out.println(avg(ints));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static double avg(int[] ints){
        int sum = 0;
        for (int i = 0; i <ints.length ; i++) {
            sum+=ints[i];
        }
        return sum/ints.length;
    }
}
