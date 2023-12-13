import java.io.*;

public class InputStreamReaderTest {
    public static void main(String[] args) throws Exception {
        try {
            InputStream is = System.in;
            InputStreamReader isr = new InputStreamReader(is);

            System.out.println("AAAA");

            int data;
            while ((data = isr.read()) != -1) {
                char character = (char) data;
                System.out.print(character);

                if (character == '\n') {

                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
