package March_11th;

public class Worker extends Person{
    /**
     * 增加属性：单位unit、工龄workAge； 重写工作方法（工人的工作是盖房子
     */
    private String unit;
    private int workAge;

    public Worker(String unit, int workAge) {
        this.unit = unit;
        this.workAge = workAge;
    }

    public Worker(String name, String gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子");
    }
}
