package March_11th;

public class Truck extends Vehicle{
    private double payload;

    public Truck(double payload) {
        this.payload = payload;
    }

    public Truck(int wheels, double weight, double payload) {
        super(wheels, weight);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
}
