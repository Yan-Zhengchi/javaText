package March_19th.Test1;

import java.util.ArrayList;

public class Test1 {
    /**
     * 有一个学生类Student   学生编号，学生姓名，现在对学生仓库做增删改查操作 学生每次被添加  该学生的学号自加1   如 9527   9528  等等
     */
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("小明"));
        students.add(new Student("小丽"));
        students.add(new Student("小华"));
        students.add(new Student("小毛"));
        students.remove(2);
        for (Student student : students) {
            System.out.println(student.getName()+"    学号为"+student.getNum());
        }
    }

}

