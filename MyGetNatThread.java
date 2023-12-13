import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class MyGetNatThread implements Runnable {
    private File dir;
    private String url;

    public MyGetNatThread(File dir, String url) {
        this.dir = dir;
        this.url = url;
    }

    @Override
    public void run() {
        String filename = url.substring((url.lastIndexOf("/", 1)));
        File file = new File(dir, filename);

        try {
            URL myUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) myUrl.openConnection();
            InputStream is = conn.getInputStream();
            FileOutputStream fos = new FileOutputStream(file);

            System.out.println("Wallpaper: " + filename + " kick-off!");

            int length = 0;
            byte[] b = new byte[4096];
            while ((length = is.read(b)) != -1) {
                fos.write(b, 0, length);
                fos.flush();
            }
            fos.close();
            is.close();
            // 連線不用關碧
            // conn.close()

        } catch (MalformedInputException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
