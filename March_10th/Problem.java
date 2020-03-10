package March_10th;

import java.time.temporal.ValueRange;
import java.util.HashSet;
import java.util.Random;

public class Problem {
    /**
     * 试题类（试题编号number,试题内容title,试题选项 anwserA  anwserB anwserC anwserD  试题答案  Anwser）
     */
    private int number;
    private String title;
    private String anwser;
    public static String anwserA;
    public static String anwserB;
    public static String anwserC;
    public static String anwserD;
    public static Problem[] problems = new Problem[30];

    static {
        anwserA = "A";
        anwserB = "B";
        anwserC = "C";
        anwserD = "D";
    }

    public static String[] anwsers = {anwserA, anwserB, anwserC, anwserD};

    public Problem(int number, String title, String anwser) {
        this.number = number;
        this.title = title;
        this.anwser = anwser;
    }

    public String getAnwser() {
        return anwser;
    }

    @Override
    public String toString() {
        return "题号：" + this.number + "   " + "内容：" + this.title;
    }

    public static void loadAllProblems() {
        Random r = new Random();
        for (int i = 1; i <= 30; i++) {
            problems[i - 1] = new Problem(i, "Problem" + i, anwsers[r.nextInt(4)]);
        }
    }

    public static Problem[] randon_10_problems() {
        Problem[] problems_10 = new Problem[10];
        HashSet<Integer> set = new HashSet<>();
        Random r = new Random();
        while (set.size() < 10) {
            set.add(r.nextInt(30));
        }
        int index = 0;
        for (Integer i : set
        ) {
            problems_10[index] = problems[i];
            index++;
        }
        return problems_10;
    }

    public static int makeScore(Problem[] p, String[] strings) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (p[i].anwser.equals(strings[i])) {
                sum += 10;
            }
        }
        return sum;
    }


}
