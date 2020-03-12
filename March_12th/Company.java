package March_13th;

import java.util.ArrayList;

public class Company {
    /**
     * 1）制作一个销售首饰的公司类。
     * 属性:
     * 一个保存员工的数组。
     * 方法：
     * 1, 添加一个员工。
     * 2,  通过员工的名字来删除员工。
     * 3,  通过员工的名字来显示员工的工资。
     * 4,  输出所有员工的工资和。
     */
    private ArrayList<Employee> arrayList;

    public Company(ArrayList<Employee> arrayList) {
        this.arrayList = arrayList;
    }

    public void addEmployee(Employee employee){
        arrayList.add(employee);
    }
    public void delete(String name){
        for (Employee employee:arrayList
             ) {
            if(employee.getName().equals(name)){
                arrayList.remove(employee);
            }
        }
    }
    public void showSalary(String name){
        for (Employee employee:arrayList
             ) {
            if (employee.getName().equals(name)){
                System.out.println(employee.getName()+"的工资是："+employee.salary());
            }
        }

    }
    public void showAllSalary(){
        double sum = 0;
        for (Employee empolyee:arrayList
             ) {
            sum+=empolyee.salary();
        }
        System.out.println("所有员工的工资为："+sum);
    }
}
