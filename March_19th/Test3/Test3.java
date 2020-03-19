package March_19th.Test3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Test3 {
    /**
     * 某班级有 40 个学生，学号为 180201-180240，全部参加 Java 集合阶段检测，给出所有同学的成绩（可随机产生，范围为 50-100），
     *
     * 请编写程序将本班各位同学成绩从高往低排序打印输出，
     * 注：成绩相同时学号较小的优先打印要求：打印的信息包含学号、姓名（姓名统一为“同学 J”[J=10,11,12。。。]）和成绩
     */
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i <40 ; i++) {
            students.add(new Student(i, (new Random().nextInt(50)+50)));
        }

        students.sort((o1,o2)->o2.getScore()-o1.getScore());

        for (Student student : students) {
            System.out.println("学号为"+student.getNum()+"的学生成绩为"+student.getScore());
        }
    }
}
