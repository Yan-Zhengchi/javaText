package March_11th;

public class Person {
    /**
     * 属性：姓名name、性别gender、年龄age、国籍nationality； 方法：吃饭eat、睡觉sleep，工作work。
     */
    private String name;
    private String gender;
    private int age;
    private String nationality;

    public Person() {
    }

    public Person(String name, String gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public void eat(){
        System.out.println("人会吃饭");
    }
    public void sleep(){
        System.out.println("人会睡觉");
    }
    public void work(){
        System.out.println("人会工作");
    }

}
