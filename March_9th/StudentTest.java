public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("小明", new Subject("数学", 89.0),
                new Subject("语文", 86.0), new Subject("英语", 83.0),
                new Subject("理综", 85.0));
        Student student2 = new Student("小丽", new Subject("数学", 79.0),
                new Subject("语文", 76.0), new Subject("英语", 73.0),
                new Subject("理综", 75.0));
        Student student3 = new Student("小华", new Subject("数学", 69.0),
                new Subject("语文", 86.0), new Subject("英语", 63.0),
                new Subject("理综", 95.0));
        Student student4 = new Student("小刘", new Subject("数学", 59.0),
                new Subject("语文", 56.0), new Subject("英语", 83.0),
                new Subject("理综", 85.0));
        Student student5 = new Student("小梅", new Subject("数学", 89.0),
                new Subject("语文", 56.0), new Subject("英语", 43.0),
                new Subject("理综", 35.0));
        Student[] students = {student1, student2, student3, student4, student5};
        Student.maxAvgScore(students);
        Student.maxScience(students);

    }
}
