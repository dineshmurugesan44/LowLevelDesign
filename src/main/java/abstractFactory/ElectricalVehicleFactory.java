package abstractFactory;

public class ElectricalVehicleFactory implements VehicleComponentFactory{
    @Override
    public Car createCar() {
        return new ElectricCar();
    }

    @Override
    public Bike createBike() {
        return new ElectricBike();
    }
}
