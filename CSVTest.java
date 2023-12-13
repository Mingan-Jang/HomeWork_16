import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVTest {

    public static void main(String[] args) throws IOException {
        // Method 1
        // 讓文字先以位元的形式讀進來, 再指定對應的編碼做轉換
        String s950 = "A001._with950.csv";
        String s65001 = "A001._with65001.csv";
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\EX14\\Documents\\02_Coding\\01_Java\\02_Java_Tibame\\HomeWork_16\\A001._with950.csv");
        InputStreamReader isr = new InputStreamReader(fis, "MS950");
        BufferedReader br = new BufferedReader(isr);

        String data;
        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }

        br.close();
        isr.close();
        fis.close();

        // FileInputStream fis = new FileInputStream("C:\\javawork\\students.csv");
        // InputStreamReader isr = new InputStreamReader(fis, "MS950");
        // BufferedReader br = new BufferedReader(isr);
        //
        // String data;
        // while ((data = br.readLine()) != null) {
        // System.out.println(data);
        // }
        //
        // br.close();
        // isr.close();
        // fis.close();

        // // 2. 讓文字先以位元的形式讀進來, 再利用字串建構子做轉換
        // File file = new File("C:\\javawork\\students.csv");
        // FileInputStream fis = new FileInputStream(file);
        //
        //// byte[] data = new byte[(int)file.length()];
        //// fis.read(data);
        // // 上面兩行程式碼, 從JDK 9可簡化成 :
        // byte[] data = fis.readAllBytes();
        //
        // System.out.println(new String(data, "MS950"));

        // fis.close();
    }
}