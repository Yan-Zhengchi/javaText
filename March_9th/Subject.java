public class Subject {
    public String Subname;
    public double score;

    public String getSubname() {
        return Subname;
    }

    public void setSubname(String subname) {
        Subname = subname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 100) {
            System.out.println("成绩非法");
        }
        this.score = score;
    }

    public Subject(String subname, double score) {
        Subname = subname;
        this.score = score;
    }
}
