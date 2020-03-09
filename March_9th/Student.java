public class Student {
    private String name;
    private Subject math;
    private Subject Chinese;
    private Subject English;
    private Subject science;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getMath() {
        return math;
    }

    public void setMath(Subject math) {
        this.math = math;
    }

    public Subject getChinese() {
        return Chinese;
    }

    public void setChinese(Subject chinese) {
        Chinese = chinese;
    }

    public Subject getEnglish() {
        return English;
    }

    public void setEnglish(Subject english) {
        English = english;
    }

    public Subject getScience() {
        return science;
    }

    public void setScience(Subject science) {
        this.science = science;
    }

    public Student(String name, Subject math, Subject chinese, Subject english, Subject science) {
        this.name = name;
        this.math = math;
        Chinese = chinese;
        English = english;
        this.science = science;
    }

    public double avg() {
        return (math.getScore() + Chinese.getScore() + English.getScore() + science.getScore()) / 4;
    }

    public static void maxAvgScore(Student[] students) {
        for (int i = 0; i < students.length-1; i++) {
            if (students[i].avg() > students[i + 1].avg()) {
                Student temp = students[i];
                students[i] = students[i + 1];
                students[i + 1] = temp;
            }
        }
        System.out.println("平均分最高的学生是：" + students[students.length - 1].getName());
        System.out.println("他的数学成绩是" + students[students.length - 1].getMath().getScore());
        System.out.println("他的语文成绩是" + students[students.length - 1].getChinese().getScore());
        System.out.println("他的英语成绩是" + students[students.length - 1].getEnglish().getScore());
        System.out.println("他的理综成绩是" + students[students.length - 1].getScience().getScore());
    }

    public static void maxScience(Student[] students) {
        for (int i = 0; i < students.length-1; i++) {
            if (students[i].getScience().getScore() > students[i + 1].getScience().getScore()) {
                Student temp = students[i];
                students[i] = students[i + 1];
                students[i + 1] = temp;
            }
        }
        System.out.println("理科最高的学生是：" + students[students.length - 1].getName());
        System.out.println("他的理综成绩是" + students[students.length - 1].getScience().getScore());
    }

}
