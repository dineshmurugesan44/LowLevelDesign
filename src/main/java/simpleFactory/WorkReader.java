package simpleFactory;

public class WorkReader implements DocumentReader{
    @Override
    public void open() {
        System.out.println("Opening Work Reader");
    }
}
