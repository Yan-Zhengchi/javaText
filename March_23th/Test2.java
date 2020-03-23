package March_23th;

public class Test2{

    public static void main(String[] args) {
        Integer[] integers = {5,8,6,7,10,2,4,5};
        Double[] doubles = {3.6,5.3,2.6,9.8};
        Numbers<Integer> integerNumbers = new Numbers<Integer>(integers);
        System.out.println("Integer数组的最小值为："+integerNumbers.getMin());
        System.out.println("Integer数组的最大值为："+integerNumbers.getMax());
        System.out.println("Integer数组的平均值为："+integerNumbers.getAvg());
        Numbers<Double> doubleNumbers = new Numbers<>(doubles);
        System.out.println("Double数组的最小值为："+doubleNumbers.getMin());
        System.out.println("Double数组的最大值为："+doubleNumbers.getMax());
        System.out.println("Double数组的平均值为："+doubleNumbers.getAvg());

    }

}
