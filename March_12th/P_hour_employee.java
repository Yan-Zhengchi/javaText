package March_13th;

public class P_hour_employee implements Employee{
    /**
     * 小时工类，实现员工接口
     * 属性：
     * 工作的小时，每小时工资。
     * 方法：
     * 1. 设置工作的小时
     * 2. 设置每小时的工资。
     * 3. 重写计算工资方法：
     * 小时工没有基本工资，他的工资就是工作的小时*每小时工资。
     */
    private String name;
    private int hour;
    private int p_hour_salary;

    public P_hour_employee(String name, int hour, int p_hour_salary) {
        this.name = name;
        this.hour = hour;
        this.p_hour_salary = p_hour_salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getP_hour_salary() {
        return p_hour_salary;
    }

    public void setP_hour_salary(int p_hour_salary) {
        this.p_hour_salary = p_hour_salary;
    }

    @Override
    public double salary() {
        return hour*p_hour_salary;
    }
}
