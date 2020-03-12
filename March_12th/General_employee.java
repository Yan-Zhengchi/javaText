package March_13th;

public class General_employee implements Employee{
    /**
     * 普通员工类，实现员工接口
     * 属性：
     * 工作的小时
     * 基本工资
     * 方法：
     * 1. 设置工作的小时
     * 2. 重写计算工资的方法：
     * 当每月工作的小时数超过196 小时时，超出的部分按每小时200 元。
     * 基本工资+（工作的小时-196）*200。
     */
    private String name;
    private int hour;
    private double basic_salary;

    public General_employee(String name, int hour, double basic_salary) {
        this.name = name;
        this.hour = hour;
        this.basic_salary = basic_salary;
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

    public double getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

    @Override
    public double salary() {
        if(hour>196){
            return (hour-196)*200+basic_salary;
        }else{
            return basic_salary;
        }
    }
}
