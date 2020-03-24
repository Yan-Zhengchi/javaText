package March_24th;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {
    /**
     * 在程序中创建一个Student类型的对象，并把对象信息保存到/io/student.txt文件中
     * ，然后再从文件中把Student对象的信息读出,并且把读出来的数据重新赛给一个对象,然后显示在控制台上
     */
    public static void main(String[] args) throws IOException {
        Student student = new Student(1,"name");
        File file = new File("src\\March_24th\\io");
        file.mkdir();
        File file2 = new File("src\\March_24th\\io\\student.txt");
        file2.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write((""+student.getId()+","+student.getName()).getBytes());
        fileOutputStream.flush();
        FileInputStream fileInputStream = new FileInputStream(file2);
        byte[] bytes = new byte[1];
        int len = 0;
        String s = "";
        while((len=fileInputStream.read(bytes))!=-1){
            s+=new String(bytes);
        }
        String[] split = s.split(",");
        Student student2 = new Student(Integer.parseInt(split[0]),split[1]);
        System.out.println(student2);
    }
}
class Student{
    private int id;
    private String name;
    public Student(int id ,String name){
        this.id= id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
