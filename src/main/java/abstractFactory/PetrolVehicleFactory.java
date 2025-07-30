package abstractFactory;

public class PetrolVehicleFactory implements VehicleComponentFactory {
    @Override
    public Bike createBike() {
        return new PetrolBike();
    }

    @Override
    public Car createCar() {
        return new PetrolCar();
    }
}
