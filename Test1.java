public class Test1 {
    /**
     * 有10长度的字符串数组,根据字符串的长度进行降序排序输出
     */
    public static void main(String[] args) {
        String[] strings = {"我我我我", "我我我我我我我", "我", "我我我我我我", "我我我", "我我我我我我我我我我", "我我我", "我我", "我", "我"};
        //遍历按字符串长度排序后的数组
        for (String s : sortArray(strings)
        ) {
            System.out.println(s);
        }

    }

    //冒泡排序算法
    public static String[] sortArray(String[] strings) {
        String temp = null;
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].length() < strings[j + 1].length()) {
                    temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }

            }

        }
        return strings;
    }
}
