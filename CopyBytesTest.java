import java.io.*;

public class CopyBytesTest {
    public static void main(String[] args) throws IOException {
        File inputFile = new File(".\\farrago.txt");
        File outputFile = new File("\\outagain.txt");

        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
            System.out.println((char) c);
            System.out.flush();

        }
        in.close();
        out.close();
    }
}
