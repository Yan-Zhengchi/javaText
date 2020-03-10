public class DepartmentTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("小明",20,"13399999999");
        Employee employee2 = new Employee("小丽",25,"13388888888");
        Employee employee3 = new Employee("小华",29,"13355555555");
        Employee employee4 = new Employee("小宁",18,"13344444444");
        Employee employee5 = new Employee("小东",50,"13333333333");
        Employee[] employees1 ={employee1,employee2,employee3} ;
        Employee[] employees2 ={employee4,employee5};
        Department department1 = new Department("HuaWei",555,"垃圾桶",employees1);
        Department department2 = new Department("XiaoMi",666,"马桶",employees2);
        System.out.println(department1);
        System.out.println(department2);
    }
}
