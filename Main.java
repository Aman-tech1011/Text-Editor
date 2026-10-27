
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

class DocumentEditor {

    private List<String> elements;

    public DocumentEditor() {
        elements = new ArrayList<>();
    }

    // Add text to document
    public void addText(String text) {
        elements.add("TEXT: " + text);
    }

    // Add image to document
    public void addImage(String path) {
        elements.add("IMAGE: " + path);
    }

    // Render document
    public void renderDocument() {
        for (String element : elements) {
            System.out.println(element);
        }
    }

    // Save document to file
    public void saveToFile(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            for (String element : elements) {
                writer.write(element + System.lineSeparator());
            }

            System.out.println("Document saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving document: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {

        DocumentEditor doc = new DocumentEditor();

        doc.addText("Aman kumar");
        doc.addImage("aman.png");
        doc.addText("Welcome to GLA Univeristy");

        System.out.println("Document Content:");
        doc.renderDocument();

        doc.saveToFile("gla.txt");
    }
}
