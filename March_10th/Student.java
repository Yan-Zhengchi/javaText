package March_10th;

import java.util.Random;

public class Student {
    /**
     * 现有
     * 学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）
     * 试题类（试题编号number,试题内容title,试题选项 anwserA  anwserB anwserC anwserD  试题答案  Anwser）
     * 要求:
     * 其中一个学生（有6个）登录账号进行考试,在控制台随机显示10个题目,并且输入题目的正确答案才会有分数,
     * 每题10分,现在有30个题目(题目自己出,不做要求)。
     * 求学生考完试在控制台最终得到的分数
     */
    private int stuNum;
    private String stuName;
    private int stuGrade;
    private int stuScore;
    private static Student[] students = new Student[6];

    public Student(int stuNum, String stuName, int stuGrade) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuGrade = stuGrade;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(int stuGrade) {
        this.stuGrade = stuGrade;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }

    public static void loadAllStudents() {
        for (int i = 1; i <= 6; i++) {
            students[i - 1] = new Student(i, "Student" + i, 7 - i);
        }
    }

    public static Student getStudent() {
        Random random = new Random();
        return students[random.nextInt(6)];
    }
}
