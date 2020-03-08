import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Practice4 {
    /**
     * 1.	任意输入 n行 n列的乘法口诀表
     * 2.	输入三个班，每班10个学生的成绩，求每个班的总分和平均分
     * 3.打印出下面的图案
     * 54321
     * 5432
     * 543
     * 54
     * 5
     * <p>
     * 4.定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
     * <p>
     * 5.输入10个整数存入数组，然后复制到b数组中输出
     * <p>
     * 6.声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分
     * <p>
     * <p>
     * 7.定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。
     *
     * @param args
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
                    question5();
                    break;
                case 7:
                    question5();
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
        System.out.println("请输入乘法口诀表的行列数n：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                mul = i * j;
                System.out.print(j + "*" + i + "=" + mul + "\t");
            }

            System.out.println();
        }

        return;
    }

    public static void question2() {
        int[] class1 = new int[10];
        int[] class2 = new int[10];
        int[] class3 = new int[10];
        System.out.println("请输入第1个班十个学生的成绩：");
        for (int i = 0; i < 10; i++) {

            Scanner scanner = new Scanner(System.in);
            class1[i] = scanner.nextInt();
        }
        System.out.println("请输入第2个班十个学生的成绩：");
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            class2[i] = scanner.nextInt();
        }
        System.out.println("请输入第3个班十个学生的成绩：");
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            class3[i] = scanner.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int avg1 = 0;
        int avg2 = 0;
        int avg3 = 0;
        for (int i = 0; i < 10; i++) {
            sum1 += class1[i];
        }
        System.out.println("一班总成绩为" + sum1);
        System.out.println("平均成绩为" + avg1);
        for (int i = 0; i < 10; i++) {
            sum2 += class2[i];
        }
        System.out.println("二班总成绩为" + sum2);
        System.out.println("平均成绩为" + avg2);
        for (int i = 0; i < 10; i++) {
            sum3 += class3[i];
        }
        System.out.println("三班总成绩为" + sum3);
        System.out.println("平均成绩为" + avg3);
    }

    public static void question3() {
        //int[][] ints = new int[5][5];
        for (int i = 5; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print(5-j +"  ");
            }
            System.out.println();
        }



    }

    public static void question4() {
        int[] ints = new int[10];
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("请输入十个整数");
        for (int i = 0; i <10 ; i++) {
            Scanner scanner = new Scanner(System.in);
            ints[i] = scanner.nextInt();
        }
        for (int i = 0; i <10 ; i++) {
            map.put(ints[i],i);
        }
        Set<Integer> integers = map.keySet();
        int[] ints2 = new int[10];
        int index = 0;
        for (Integer i:integers
             ) {
            ints2[index] = i;
            index++;
        }
        for (int i = 0; i < ints2.length-1; i++) {
            if (ints2[i]>ints2[i+1]){
                int temp = ints2[i];
                ints2[i] = ints2[i+1];
                ints2[i+1] = temp;
            }
        }
        System.out.println("最大的值是："+ints2[ints2.length-1]+"    索引是："+(map.get(ints2.length-1)));

    }

    public static void question5() {
        System.out.println("作者暂时还没写，小看了作业量，干不完了哈哈哈哈睡觉");
    }

    public static void question6() {
        System.out.println("作者暂时还没写，小看了作业量，干不完了哈哈哈哈睡觉");
    }

    public static void question7() {
        System.out.println("作者暂时还没写，小看了作业量，干不完了哈哈哈哈睡觉");
    }


}


