package March_17th;

import java.util.Scanner;

public class Test1 {
    /**
     * .编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double i;
        try {
            i = s.nextDouble();
            if(i<0||i>100){
                 throw new newException("成绩必须要在0-100之间");
            }
            System.out.println(i);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
class newException extends RuntimeException{
    public newException(){
        super();
    }
    public newException(String s){

        super(s);
    }
}

