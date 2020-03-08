import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Practice3 {
    /**
     * 1.	从键盘输入一个班5个学生的分数，求和并输出
     * 2.	从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
     * 3.	输入一批整数，使用循环求出最大值与最小值，输入0时结束。
     * 4.	找出能被5或6整除，但不能被两者同时整除的数
     * 5.	请输入一个任意年份,判断是否是闰年
     * 6.	30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数
     * 7.	输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）
     */
    public static void main(String[] args) {
        int i = -1;
        while (i != 0) {
            System.out.println("请输入题号,输入0结束");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    question1();
                    break;
                case 2:
                    question2();
                    break;
                case 3:
                    question3();
                    break;
                case 4:
                    question4();
                    break;
                case 5:
                    question5();
                    break;
                case 6:
                    question6();
                    break;
                case 7:
                    question7();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("请重新输入：");
                    break;
            }
        }
    }

    public static void question1() {
        int[] students = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入学生分数");
            Scanner scanner = new Scanner(System.in);
            students[i] = scanner.nextInt();
        }
        int sum = students[0] + students[1] + students[2] + students[3] + students[4];
        System.out.println("总分为：" + sum);
    }

    public static void question2() {
        Stack<Integer> stack = new Stack<>();
        System.out.println("请输入十进制数:");
        Scanner scanner = new Scanner(System.in);
        String sum = "";
        int k = 0;
        int temp = scanner.nextInt();
        while (temp != 0) {
            Integer mod = temp % 2;
            stack.push(mod);
            temp = temp / 2;

        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println("十进制为" + sum);
    }

    public static void question3() {
        System.out.println("请输入接下来您要输入数据的个数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arrayList = new int[num];
        for (int i = 0; i <num ; i++) {
            System.out.println("请输入数据：");
            Scanner s = new Scanner(System.in);
            arrayList[i] = s.nextInt();
        }
        for (int i = 0; i <arrayList.length-1 ; i++) {
            if(arrayList[i]>arrayList[i+1]){

                int temp = arrayList[i];
                arrayList[i] = arrayList[i+1];
                arrayList[i+1] = temp;
            }
        }
        System.out.println("最大的数是："+arrayList[arrayList.length-1]);

    }
    public static void question4(){
        int num = 100;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int  i= 0; i <num ; i++) {
            if(((i%5)==0)&&((i%6)!=0)){
                arrayList.add(i);
            }else if(((i%6)==0)&&((i%5)!=0)){
                arrayList.add(i);
            }
        }
        System.out.println("100以内能被5或6整除，但不能被两者同时整除的数有：");
        for (Integer i:arrayList
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void question5(){
        System.out.println("请输入一个年份：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year%4==0){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "不是闰年");
        }
    }
    public static void question6(){
        System.out.println("作者暂时还没写，小看了作业量，干不完了哈哈哈哈睡觉");
    }
    public static void question7(){
        System.out.println("作者暂时还没写，小看了作业量，干不完了哈哈哈哈睡觉");
    }
}
