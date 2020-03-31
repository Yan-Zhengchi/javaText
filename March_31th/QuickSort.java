package March_31th;

public class QuickSort {
    /**
     * 快速排序算法实现
     * 基本原理：将数组第一个数据作为基准
     * 右哨兵向左寻找小于基准数的数
     * 左哨兵向右寻找大于基准数的数
     * 找到之后交换左右哨兵的值
     * 继续寻找直到左哨兵等于右哨兵
     * 将基准值和左右哨兵值互换
     * 之后递归处理基准值左侧所有数据和右侧所有数据
     * 直到排序结束
     */
    public static void main(String[] args) {
        int[] ints = {6,9,3,0,1,5,7,3,6,8,4,7};
        quickSort(ints,0,ints.length-1);
        for (int i = 0; i <ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left>right){
            return;
        }
        int l = left;
        int r = right;
        int base = arr[left];
        while(l != r){
            while (arr[r]>=base&&l<r){
                r--;
            }
            while (arr[l]<=base&&l<r){
                l++;
            }
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
        }
        arr[left] = arr[l];
        arr[l] = base;
        quickSort(arr,left,l-1);
        quickSort(arr,l+1,right);

    }
}
