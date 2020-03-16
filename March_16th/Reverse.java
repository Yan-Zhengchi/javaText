package March_16th;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        String[] s = {"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
        String[] news = reverse(s);
        for (String string:news
             ) {
            System.out.print(string);
        }
    }

    public static String[] reverse(String[] strings){
        String[] newStrings = new String[strings.length];
        int index = 0;
        for (String s:strings
             ) {
            Stack<Character> stack = new Stack<>();
            char[] chars = new char[s.length()];
            for (int i = 0; i <s.length() ; i++) {
              stack.push(s.charAt(i)) ;
            }
            for (int i = 0; i <s.length(); i++) {
               chars[i] = stack.pop();
            }
            newStrings[index] = new String(chars);
            index++;
        }

        return newStrings;
    }
}
