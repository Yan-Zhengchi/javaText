package March_31th;

public class BinarySearch {
    /**
     * 二分查找非递归实现
     * 非递归实现的二分查找就是用while循环
     * 判断low下标，high下标的中间值mid中的数据和被查找数据的大小
     * 如果ints【mid】小于被查找数据，则将low  =mid-1
     * 如果ints【mid】大于被查找数据，则将high = mid+1
     * 不断循环，直到ints【mid】==被查找数据，返回下标mid
     */
    public static void main(String[] args) {
        //输入需要查找内容
        int[] ints = {5,6,8,4,9,2,4,7,3};
        int target = 6;
        sort(ints);
        System.out.println("所查找的数据下标为："+startSearch(target, ints));
    }


    public static int startSearch(int target,int[] ints){
        //定义左边标记指针
        int low = 0;
        //定义右边标记指针
        int high = ints.length-1;
        while(low<=high){
            //定义中间变量
            int mid = (low+high)/2;
            if(ints[mid]==target){
                return mid;
            }else if (target<ints[mid]&&target>=low){
                high = mid-1;
            }else if(target>ints[mid]&&target<=high){
                low = mid+1;
            }
        }
        return -1;
    }
    public  static void sort(int[] ints){
        for (int i = 0;i<ints.length-1;i++){
            for (int j = 0; j <ints.length-i -1; j++) {
                if(ints[j]>ints[j+1]){
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }
    }


}
