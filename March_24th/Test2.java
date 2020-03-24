package March_24th;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    /**
     * 利用字节流或者换成字节流的方式以指定的格式输入数据 如:xxx,xxx,xxx,最后一个数据以 .号结束，一行最多五个数据*/
    public static void main(String[] args) {
        File file = new File("src\\March_24th\\2.txt");
        if (!file.exists()){
            file.mkdir();
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("qwe");
        arrayList.add("rty");
        arrayList.add("uio");
        arrayList.add("asd");
        arrayList.add("fgh");
        arrayList.add("jkl");
        arrayList.add("zxc");
        arrayList.add("vbn");
        try(FileOutputStream fos = new FileOutputStream(file);){

            for (int i = 0; i <arrayList.size() ; i++) {
                if(i!=0&&(i+1)%5==0){
                    String s = (arrayList.get(i)+","+"\n");

                    fos.write(s.getBytes());
                }else{
                    String s = arrayList.get(i) + ",";

                    fos.write(s.getBytes());
                }

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
