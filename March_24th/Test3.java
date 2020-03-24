package March_24th;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    /**
     * 创建a/test.txt文件并在其中输入"hello world",
     * 创建一个输入流读取该文件中的文本,并且把小写的l变成大写L再利用输出流写入到b/test.txt中
     */
    public static void main(String[] args) throws IOException {
        File file = new File("src\\March_24th\\a");
        file.mkdir();
        File file2 = new File("src\\March_24th\\a\\test.txt");
        file2.createNewFile();
        File file3 = new File("src\\March_24th\\b");
        file3.mkdir();
        File file4 = new File("src\\March_24th\\b\\test.txt");
        file4.createNewFile();
        FileOutputStream fos = new FileOutputStream(file2);
        fos.write("hello world".getBytes());
        FileInputStream fis = new FileInputStream(file2);
        byte[] bytes = new byte[1];
        int len;
        String s = "";
        while((len = fis.read(bytes))!=-1){
            s+=new String(bytes);
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]=='l'){
                chars[i] = 'L';
            }
        }
        FileOutputStream fos2 = new FileOutputStream(file4);
        fos2.write(new String(chars).getBytes());
        fis.close();
        fos.close();
        fos2.close();
    }
}
