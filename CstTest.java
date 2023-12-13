
import java.io.*;

public class CstTest {
    public static void main(String[] args) throws Exception {
        // 1. 讓文字先以位元的形式讀進來, 再指定對應的編碼做轉換
        FileInputStream fis = new FileInputStream("C:\\javawork\\students.csv");
        InputStreamReader isr = new InputStreamReader(fis, "MS950");
        BufferedReader br = new BufferedReader(isr);

        String data;
        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }

        br.close();
        isr.close();
        fis.close();
        // 2. 讓文字先以位元的形式讀進來, 再利用字串建構子做轉換
        File file2 = new File("C:\\javawork\\students.csv");
        FileInputStream fis2 = new FileInputStream(file2);

        byte[] data2 = new byte[(int) file2.length()];
        fis2.read(data2);
        System.out.println(new String(data2, "MS950"));
        fis2.close();
    }
}
