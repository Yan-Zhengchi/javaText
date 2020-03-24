package March_24th;

import java.io.*;
import java.util.ArrayList;

public class Test1 {
    /**
     * 找到指定文件及其子目录下面的所有的txt文件,并且把满足条件的文件全部读取出来写入到另一个txt文件里面去(使用递归完成)
     */

    public static void main(String[] args) throws IOException {
        File file = new File("src\\March_24th\\package1");
        ArrayList<File> list = new ArrayList<>();
        select(file,list);
        File targetFile = new File("src\\March_24th\\1.txt");
        targetFile.createNewFile();
        for (File file1 : list){
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(targetFile,true);
            byte[] bytes = new byte[1];
            int len = 0;
            while((len = fis.read(bytes))!=-1){
                fos.write(bytes);
                fos.flush();
            }
        }
    }
    public static void select(File file,ArrayList<File> list){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()&&file1.getName().endsWith(".txt")){
                list.add(file1);
            }
            if(file1.isDirectory()){
                select(file1,list);
            }
        }
    }

}
