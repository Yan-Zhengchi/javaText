package March_11th;

public class StudentLeader extends Student{
    /**
     * 增加属性：职务job； 增加方法：开会meeting。 编写测试类分别对上述3类具体人物进行测试。
     */
    private String job;

    public StudentLeader(String name, String gender, int age, String nationality, String school, int stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }
    public void meeting(){
        System.out.println("学生领导会开会");
    }
}
