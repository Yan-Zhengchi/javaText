package March_11th;

public class Student extends Person{
    /**
     * 增加属性：学校school、学号stuNumber； 重写工作方法（学生的工作是学习）
     */
    private String school;
    private int stuNumber;


    public Student() {
    }

    public Student(String school, int stuNumber) {
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student(String name, String gender, int age, String nationality, String school, int stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
