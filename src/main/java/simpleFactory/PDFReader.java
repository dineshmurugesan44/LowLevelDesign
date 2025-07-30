package simpleFactory;

public class PDFReader implements DocumentReader {
    @Override
    public void open() {
        System.out.println("Opening PDF File");
    }
}
