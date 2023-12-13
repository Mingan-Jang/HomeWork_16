import java.io.*;
import java.net.*;

public class GetPics {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        File dir = new File("C:\\Pics");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        for (int i = 0; i < 10; i++) {
            String url = "http://www.space-fox.com/wallpapers/celebs/natalie-portman" +
                    "/natalie_portman_" + i + ".jpg";
            String filename = url.substring(url.lastIndexOf("/") + 1);
            File file = new File(dir, filename);
            try {
                URL myUrl = new URL(url);
                HttpURLConnection conn = (HttpURLConnection) myUrl.openConnection();
                InputStream is = conn.getInputStream();
                FileOutputStream fos = new FileOutputStream(file);
                // System.out.println("Wallpaper: " + filename + " kick-off!");
                int length = 0;

                byte[] b = new byte[8192];
                while ((length = is.read(b)) != -1) {
                    fos.write(b, 0, length);
                    fos.flush();
                }
                fos.close();
                is.close();
                // System.out.println(filename + " Done!");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");

    }
}
