package March_17th;

import java.util.Scanner;

public class Test2 {
    /**
     * 写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形，
     * 如果不能则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，
     * 如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个整数， 调用此方法，并捕获异常。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        isTriangle(a,b,c);

    }
    public static void isTriangle(int a,int b,int c) {
        try {
        if((a+b>c&&a+c>b&&b+c>a)&&a>0&&b>0&&c>0){
            System.out.println(a+"    "+b+"    "+c);
        }else{
            throw new IllegalArgumentException("a,b,c不能构成三角形");
        }
        }catch (IllegalArgumentException i){
            i.printStackTrace();
        }
    }
}
