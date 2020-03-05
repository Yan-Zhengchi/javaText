import java.util.Scanner;

public class Test3 {
    /**
     * 尝试写出杨辉三角
     */
    public static void main(String[] args) {
        System.out.println("请输入杨辉三角的行数:");
        //接收行数
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        //调用fun方法创建杨辉三角二维数组
        int[][] pascalTriangle = fun(rows);
        //循环遍历二维数组
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows + 1; j++) {
                //输出二维数组中的非零数据
                if (pascalTriangle[i][j] != 0) {
                    System.out.print(pascalTriangle[i][j] + "  ");

                }
            }
            System.out.println();
        }

    }

    public static int[][] fun(int rows) {
        //通过行数创建杨辉三角二维数组
        int[][] ints = new int[rows][rows + 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                //第一行为1，第一列全是1，行数和列数相等的时候也是1
                if (i == 0 || j == 0 || i == j) {
                    ints[i][j] = 1;
                } else {
                    //排除1的数据，求出其他数据并赋值
                    ints[i][j] = ints[i - 1][j - 1] + ints[i - 1][j];
                }
            }
        }
        return ints;
    }
}
