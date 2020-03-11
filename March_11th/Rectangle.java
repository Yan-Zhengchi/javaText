package March_11th;

public class Rectangle {
    protected double length;
    protected double weight;

    public Rectangle() {
    }

    public Rectangle(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double area(){
        return length*weight;
    }
}
