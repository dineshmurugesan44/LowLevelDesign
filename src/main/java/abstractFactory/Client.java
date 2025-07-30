package abstractFactory;

public class Client {
    public static void main(String[] args) {
        VehicleComponentFactory factory = new ElectricalVehicleFactory();

        Application app = new Application(factory);
        app.display();

    }
}
