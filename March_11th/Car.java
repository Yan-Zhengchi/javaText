package March_11th;

public class Car extends Vehicle{
    private int loader;

    public Car(int loader) {
        this.loader = loader;
    }

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }
}
