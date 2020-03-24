package March_24th;

import java.io.File;
import java.util.ArrayList;

public class Test5 {
    /**
     * 找到指定路径及子路径下的所有.java文件
     */
    public static void main(String[] args) {
        File file = new File("src\\March_24th");
        print(file);

    }
    public static void print(File file){
        ArrayList<File> files1 = new ArrayList<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                if (file1.getName().endsWith(".java")){
                    files1.add(file1);
                }
            }
            if (file1.isDirectory()){
                print(file1);
            }
        }
        for (File file1 : files1) {
            System.out.println(file1.getName());
        }

    }
}
