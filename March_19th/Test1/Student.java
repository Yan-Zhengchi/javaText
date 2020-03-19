package March_19th.Test1;

public class Student {
    private String name;
    private int num;
    public static int NUM = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Student(String name) {
        NUM++;
        this.name = name;
        this.num = NUM;
    }
}
