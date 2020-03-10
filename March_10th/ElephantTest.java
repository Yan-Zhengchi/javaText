package March_10th;

import java.util.ArrayList;

public class ElephantTest {
    public static void main(String[] args) {
        ArrayList<Elephant> elephants = Elephant.loadElephant(5);
        System.out.println("现有大象:" + Elephant.getCount() + "个");
        for (Elephant e : elephants
        ) {
            System.out.println(e);
        }
        System.out.println("大象平均身高为:" + Elephant.getAvgHight(elephants));
        Elephant.modifyHight(elephants, "elephants2", 300);
        Elephant.find(elephants, "elephant2");
    }
}
