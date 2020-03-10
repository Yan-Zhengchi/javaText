package March_10th;

import java.util.ArrayList;

public class Elephant {
    /*
    //1.增加对象
    //2.根据名字删除指定对象
    //3.根据名字来修改对象信息
    //4.根据名字来查询具体的对象的信息
   */

    /**
     * 在Elephant中增加一个静态成员，统计被创建出来的大象对象的数量，私有化这个静态成员，提供静态的get和set方法
     * 在Elephant中增加一个静态成员，计算大象对象的平均身高，私有化这个静态成员，提供静态的get和set方法
     */
    private String name;
    private double hight;
    private static int count = 0;
    private static double avgHight = 0;

    public Elephant(String name, double hight) {
        this.name = name;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Elephant.count = count;
    }

    public static double getAvgHight(ArrayList<Elephant> ele) {
        double sum = 0;
        for (Elephant e : ele
        ) {
            sum += e.getHight();
        }
        Elephant.avgHight = sum / ele.size();
        return avgHight;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", hight=" + hight +
                '}';
    }

    public static void setAvgHight(ArrayList<Elephant> ele) {
        double sum = 0;
        for (Elephant e : ele
        ) {
            sum += e.getHight();
        }
        Elephant.avgHight = sum / ele.size();
    }

    public static void delete(ArrayList<Elephant> ele, String s) {
        for (Elephant e : ele
        ) {
            if (e.getName().equals(s)) {
                ele.remove(e);
            }
        }
    }

    public static void modifyHight(ArrayList<Elephant> ele, String s, double hight) {
        for (Elephant e : ele
        ) {
            if (e.getName().equals(s)) {
                e.setHight(hight);
            }
        }
    }

    public static void find(ArrayList<Elephant> ele, String s) {
        for (Elephant e : ele
        ) {
            if (e.getName().equals(s)) {
                System.out.println(e);
            }
        }
    }

    public static ArrayList<Elephant> loadElephant(int num) {
        ArrayList<Elephant> elephants = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            elephants.add(new Elephant("elephant" + i, i + 200));
            count++;
        }
        return elephants;
    }
}
