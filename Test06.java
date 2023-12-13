import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test06 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File(".\\farrago.txt");
        File outputFile = new File(".\\src\\outagain.txt");
        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream out = new FileOutputStream(outputFile);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
            System.out.print((char) c);
            System.out.flush();
        }

        // Desktop.getDesktop().open(outputFile);
    }
}
