package abstractFactory;

public class Application {
    private Bike bike;
    private Car car;

    public Application(VehicleComponentFactory factory) {
        bike = factory.createBike();
        car = factory.createCar();

    }
    public void display() {
        bike.run();
        car.Start();
    }
}
