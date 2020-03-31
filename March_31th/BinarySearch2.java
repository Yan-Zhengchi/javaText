package March_31th;

public class BinarySearch2 {
    /**
     * 递归方法实现二分查找
     * 思路和非递归一样
     * 用递归传参
     * get到最后的下标
     */
    public static void main(String[] args) {
        int[] ints = {5, 6, 8, 4, 9, 2, 4, 7, 3};
        int target = 6;
        sort(ints);
        int low = 0;
        int high = ints.length - 1;
        startBinary(low, high, target, ints);
    }

    public static void startBinary(int low, int high, int target, int[] ints) {
        int mid = (low+high)/2;
        if (ints[mid]<target&&ints[mid]>=low){
            startBinary(mid+1,high,target,ints);
        }else if(ints[mid]>target&&ints[mid]<=high){
            startBinary(low-1,mid,target,ints);
        }else if(ints[mid]==target){
            System.out.println("被查找的数据下标为："+mid);
        }
    }

    public static void sort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
    }
}
