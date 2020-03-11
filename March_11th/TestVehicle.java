package March_11th;

public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car(4,2,5);
        Truck truck = new Truck(6,5,30);
        System.out.println("卡车的轮子有"+truck.getWheels()+"个"+",重量为"+
                truck.getWeight()+"吨，"+"可以载"+truck.getPayload()+"吨货物");
        System.out.println("汽车的轮子有"+car.getWheels()+"个"+",重量为"+
                car.getWeight()+"吨，"+"可以载"+car.getLoader()+"个人");
    }
}
