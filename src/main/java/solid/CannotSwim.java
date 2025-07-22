package solid;

public class CannotSwim implements Swim{
    @Override
    public void swim() {
        System.out.println("CannotSwim");
    }
}
