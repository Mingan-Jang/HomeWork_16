import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterTest {
    public static void main(String[] args) {
        try {
            // 檢查目錄是否存在，如果不存在，則創建目錄
            File dir = new File("c:\\javawork");
            if (!dir.exists()) {
                dir.mkdirs();
            }

            // 創建 FileWriter
            FileWriter fw = new FileWriter("c:\\javawork\\hello2.txt");

            // 將 FileWriter 包裝成 BufferedWriter
            BufferedWriter bw = new BufferedWriter(fw);

            // 將 BufferedWriter 包裝成 PrintWriter
            PrintWriter pw = new PrintWriter(bw);

            // 寫入數據
            pw.println("Hello world 你好");

            // 依次關閉 PrintWriter、BufferedWriter、FileWriter
            pw.close();
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
