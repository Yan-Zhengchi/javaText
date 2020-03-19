package March_19th.Test2;

import java.util.HashSet;
import java.util.Set;

public class Student {
    /**
     * 要求：1.学生类:学号，姓名，所选课程Set<Course>
     *
     * 学生可以对课程做增删改查操作
     */
    private int stuNum;
    private String stuName;
    private HashSet<Course> courses;

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

    public HashSet<Course> getCourses() {
        return courses;
    }

    public void setCourses(Course course) {
        this.courses.add(course);
    }

    public Student(int stuNum, String stuName) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.courses = new HashSet<Course>();
    }

    @Override
    public String toString() {
        String s = "";
        System.out.print("姓名：");
        System.out.println(this.stuName);
        System.out.println("所选课程如下：");
        for (Course cours : courses) {
            System.out.print(cours.getCourseNum()+"    "+cours.getCourseName()+"    ");
        }
        return s;
    }
    public void deleteCourse(String courseName){
        Course temp = new Course();
        for (Course cours : this.courses) {
            if (courseName.equals(cours.getCourseName())){
                temp = cours;
            }
        }
        this.courses.remove(temp);
    }
}
