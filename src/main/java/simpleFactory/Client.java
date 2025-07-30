package simpleFactory;

public class Client {
    public static void main(String[] args) {
        DocumentReader reader = DocumentReaderFactory.getDocumentReader("Ppt");
        reader.open();
    }
}
