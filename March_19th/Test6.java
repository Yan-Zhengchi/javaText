package March_19th;

import java.util.HashSet;
import java.util.Scanner;

public class Test6 {
    /**
     * 手动输入一行字符串，去掉其中重复字符，打印出不同的那些字符
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        char[] chars = s1.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i <chars.length ; i++) {
            set.add(chars[i]);
        }
        for (Character character : set) {
            System.out.print(character);
        }
    }
}
