package March_19th.Test2;

import java.util.Objects;

public class Course {
    /**
     * 2.课程类：编号 课程名称
     */
    private String courseName;
    private int courseNum;

    public Course(String courseName, int courseNum) {
        this.courseName = courseName;
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public Course() {
    }
}
