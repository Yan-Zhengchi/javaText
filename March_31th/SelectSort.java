package March_31th;

/**
 * 选择排序的算法实现思路
 * 循环遍历数组，取出每次最大或者最小的值，交换到数组最前面或者最后面
 * 然后遍历剩下的数组，取出次大或次小的值，交换到数组次前面或者次后面
 *
 */

public class SelectSort {
    public static void main(String[] args) {
        int[] ints = {6,9,3,0,1,5,7,3,6,8,4,7};
        selectSort(ints);
        for (int i = 0; i <ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public static void selectSort(int[] ints){
        int min = ints[0];
        for (int i = 0; i < ints.length-1; i++) {
            for (int j = i; j <ints.length ; j++) {
                if(ints[j]<min){
                    int temp = min;
                    min = ints[j];
                    ints[j] = temp;
                }
            }
            int temp = min;
            min = ints[i];
            ints[i] = temp;
        }
    }
}
