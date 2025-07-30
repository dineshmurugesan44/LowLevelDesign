package simpleFactory;

public class PowerPoint implements DocumentReader{
    @Override
    public void open() {
        System.out.println("PowerPoint open");
    }
}
