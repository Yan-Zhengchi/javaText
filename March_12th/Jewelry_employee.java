package March_13th;

public class Jewelry_employee implements Employee{
    /**
     * 首饰工人。
     * 定义首饰工人类，实现员工接口：
     * 属性
     * 生产首饰的数量
     * 方法
     * 1  设置生产首饰的数量
     * 2  重写计算工资的方法
     * 工资  ==  设置生产首饰的数量  *50；
     */
    private String name;
    private int jewelrysNumber;

    public Jewelry_employee(String name, int jewelrysNumber) {
        this.name = name;
        this.jewelrysNumber = jewelrysNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJewelrysNumber() {
        return jewelrysNumber;
    }

    public void setJewelrysNumber(int jewelrysNumber) {
        this.jewelrysNumber = jewelrysNumber;
    }

    @Override
    public double salary() {
        return jewelrysNumber*50;
    }
}
