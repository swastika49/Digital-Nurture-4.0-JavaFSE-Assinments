import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentFactory factory;

        System.out.println("Choose document type to open:");
        System.out.println("1. Word");
        System.out.println("2. PDF");
        System.out.println("3. Excel");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                factory = new WordDocumentFactory();
                break;
            case 2:
                factory = new PdfDocumentFactory();
                break;
            case 3:
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                scanner.close();
                return;
        }

        Document doc = factory.createDocument();
        doc.open();

        scanner.close();
    }
}
