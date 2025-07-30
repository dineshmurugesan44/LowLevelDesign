package simpleFactory;

public class DocumentReaderFactory {
    public static DocumentReader getDocumentReader(String fileName) {
        switch (fileName) {
            case "Excel"
                    : return new ExcelReader();

            case "Pdf"
                    : return new PDFReader();

            case "WorkReader"
                    : return new WorkReader();

            case "Ppt"
                : return new PowerPoint();

        }
        return null;
    }
}
