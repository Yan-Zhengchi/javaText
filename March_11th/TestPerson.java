package March_11th;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("小明", "男", 20, "中国");
        Worker worker = new Worker("小刘", "男", 40, "中国",
                "工地",20);
        Student student = new Student("小丽", "男", 20, "中国",
                "学校",208170934);
        StudentLeader studentLeader = new StudentLeader("小东", "男", 20,
                "中国", "学校",208170934,"管理学生");
        person.work();
        student.work();
        worker.work();
        studentLeader.meeting();
    }
}
