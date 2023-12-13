import java.io.File;
import java.io.FileInputStream;

public class Available {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\student.csv");
        // file檔案大小預設採用 length()方法
        System.out.println(file.length());
        // 13

        // InputStream預設採用available()方法
        FileInputStream fis = new FileInputStream(file);
        System.out.println(fis.available());
        // 13
        fis.close();
    }
}
