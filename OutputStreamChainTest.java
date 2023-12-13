import java.io.*;

public class OutputStreamChainTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("c:\\javawork\\hello.txt");
            FileOutputStream fos2 = new FileOutputStream("c:\\javawork\\hello.txt", true);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            PrintStream ps = new PrintStream(bos);
            ps.println("你好");
            ps.close();
            bos.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
