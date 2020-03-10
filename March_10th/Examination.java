package March_10th;

import java.util.Scanner;

public class Examination {


    public static void main(String[] args) {
        startExam();
    }


    public static void startExam() {
        Problem.loadAllProblems();
        Problem[] problems = Problem.randon_10_problems();
        Student.loadAllStudents();
        Student student = Student.getStudent();
        System.out.println("学号为：" + student.getStuNum() + "," + "姓名为" + student.getStuName() + "的学生开始了考试...");

        for (Problem p : problems
        ) {
            System.out.println(p);
        }
        System.out.println("请依次输入每道题的答案(大写字母):");
        String[] strings = new String[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.next();
        }
        student.setStuScore(Problem.makeScore(problems, strings));
        System.out.println("考试结束,考试成绩为:" + student.getStuScore());
        System.out.println("正确答案依次为:");
        for (int i = 0; i < 10; i++) {
            System.out.print(problems[i].getAnwser() + "  ");
        }
    }
}
