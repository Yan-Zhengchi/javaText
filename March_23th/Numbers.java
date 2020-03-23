package March_23th;

public class Numbers<T extends Number> {
    /**
     * 定义泛型类，成员变量是Number类或其子类对象的数组，
     * 成员方法有：求数组元素最小值、最大值和平均值。创建泛型类对象，
     * 分别求Integer和Double型数组的最小最大、平均值
     */
    private T[] numbers;

    public Numbers(T[] numbers) {
        this.numbers = numbers;
    }

    public T getMin(){
        this.sort();
        return numbers[0];
    }

    public T getMax(){
        this.sort();
        return numbers[numbers.length-1];
    }

    public Double getAvg(){
        if(numbers instanceof Double[]){
            double sum = 0;
            for (int i = 0; i <numbers.length ; i++) {
                sum+= numbers[i].doubleValue();
            }
            return sum/numbers.length;
        }else if(numbers instanceof Integer[]){
            double sum = 0;
            for (int i = 0; i <numbers.length ; i++) {
                sum += numbers[i].intValue();
            }
            return sum/numbers.length;
        }else{
            return null;
        }

    }
    public void sort(){
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if (numbers[i].byteValue()<numbers[j].byteValue()){
                    T temp = null;
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

}
