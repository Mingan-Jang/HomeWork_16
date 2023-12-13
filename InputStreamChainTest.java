
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamChainTest {
    public static void main(String[] args) {
        int i;
        try {
            long startTime = System.currentTimeMillis();

            // Example 1
            FileInputStream fis = new FileInputStream("c:\\javawork\\hello.txt");
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
            fis.close();

            long endTime = System.currentTimeMillis();
            System.out.println((endTime - startTime) / 1000);

            FileInputStream fis2 = new FileInputStream("c:\\javawork\\hello.txt");
            BufferedInputStream bis = new BufferedInputStream(fis2);
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);

            }
        } catch (IOException e) {
        }
    }
}
