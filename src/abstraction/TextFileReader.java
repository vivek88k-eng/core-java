package abstraction;

public class TextFileReader extends FileReader {
    void readFile(String path) {
        System.out.println("Reading text file from: " + path);
    }
}
