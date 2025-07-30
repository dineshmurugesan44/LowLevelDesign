package simpleFactory;

public class ExcelReader implements DocumentReader {
    @Override
    public void open() {
        System.out.println("Open Excel File");
    }
}
