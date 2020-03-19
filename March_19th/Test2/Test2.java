package March_19th.Test2;

public class Test2 {
    /**
     * 1.模拟在校学生选课系统,使用集合完成
     *
     * 3.学生选课清单类
     *
     * 完成:有n个人 显示出每个人所选的课程信息
     *
     * 如：姓名：张三:    所选课程如下： 9527  java基础 ，9768 C# ，9898 javaScript 等
     */
    public static void main(String[] args) {
        Course javaSE= new Course("java基础", 5698);
        Course C_Sharp = new Course("C#", 5478);
        Course javaScript = new Course("javaScript", 5698);
        Student student1 = new Student( 235689,"张三");
        student1.setCourses(javaSE);
        student1.setCourses(C_Sharp);
        student1.setCourses(javaScript);
        System.out.println(student1);
        student1.deleteCourse("java基础");
        System.out.println(student1);


    }
}
