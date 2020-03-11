package March_11th;

public class Box extends Rectangle{
    private double hight;

    public Box(double hight) {
        this.hight = hight;
    }

    public Box(double length, double weight, double hight) {
        super(length, weight);
        this.hight = hight;
    }
    public double volume(){
        return hight*weight*length;
    }
}
