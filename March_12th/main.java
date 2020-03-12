package March_13th;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /**
         * 一个公司对象；
         * 一个小时工的对象，每小时工资10，工作 200 小时；
         * 一个小时工的对象，每小时工资10，工作 230 小时；
         * 一个销售员工的对象，销售额5000；
         * 一个销售员工的对象，销售额200000；
         * 一个普通员工对象，工作小时205 小时。
         * 将以上员工对象加入公司对象中，然后调用输出所有员工工资和的方法，查看该公司该月应
         * 该发的工资总和。
         * 在main 函数中多生成一个首饰工人对象，生产首饰的数量30；
         * 将该对象加入公司对象中，
         * 然后调用输出所有员工工资和的方法，查看该公司该月应该发的工资总和。
         */
        Company company = new Company(new ArrayList<>());
        company.addEmployee(new P_hour_employee("小时工a",200,10));
        company.addEmployee(new P_hour_employee("小时工b",230,10));
        company.addEmployee(new Sales_employee("销售员工a",5000,2000));
        company.addEmployee(new Sales_employee("销售员工a",200000,2000));
        company.addEmployee(new General_employee("普通员工a",205,2000));
        company.showAllSalary();
        company.addEmployee(new Jewelry_employee("首饰工人a",30));
        company.showAllSalary();

    }
}
