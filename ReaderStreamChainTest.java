import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderStreamChainTest {
    public static void main(String args[]) {
        int i;

        try {
            int a = 0;

            // Method 1
            // char[] b = new char[2048];
            // FileReader fr = new FileReader("c:\\javawork\\hello.txt");
            // while ((i = fr.read(b)) != -1) {
            // System.out.println((char) i);
            // }
            // fr.close();

            // Method 2
            FileReader fr = new FileReader("c:\\javawork\\hello.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((i = br.read()) != -1) {
                System.out.println((char) i);
            }
            br.close();
            fr.close();

        } catch (Exception e) {

        }

    }
}
