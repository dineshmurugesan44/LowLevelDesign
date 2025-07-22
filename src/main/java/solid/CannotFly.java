package solid;

public class CannotFly implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
