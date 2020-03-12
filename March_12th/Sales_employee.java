package March_13th;

public class Sales_employee implements Employee{
    /**
     * 销售员工类，实现员工接口
     * 属性：
     * 销售的总金额
     * 基本工资
     * 方法
     * 1. 设置销售的总金额
     * 2. 重写计算工资方法：
     * 基本工资+提成。
     * 提成的计算：
     * 当销售额再10000 以下时，则提成10%，
     * 等销售额再10000-100000之间是，则提成15%。
     * 再 100000以上是，提成18%。
     */
    private String name;
    private double sale_money;
    private double basic_wage;

    public Sales_employee(String name, double sale_money, double basic_wage) {
        this.name = name;
        this.sale_money = sale_money;
        this.basic_wage = basic_wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSale_money() {
        return sale_money;
    }

    public void setSale_money(double sale_money) {
        this.sale_money = sale_money;
    }

    public double getBasic_wage() {
        return basic_wage;
    }

    public void setBasic_wage(double basic_wage) {
        this.basic_wage = basic_wage;
    }

    @Override
    public double salary() {
        if(sale_money<10000){
            return basic_wage+sale_money*0.1;
        }else if(sale_money>=10000&&sale_money<100000){
            return basic_wage+sale_money*0.15;
        }else{
            return basic_wage+sale_money*0.18;
        }
    }
}
