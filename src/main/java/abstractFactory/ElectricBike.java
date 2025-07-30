package abstractFactory;

public class ElectricBike implements Bike {
    @Override
    public void run() {
        System.out.println("Electric Bike is running");
    }
}
