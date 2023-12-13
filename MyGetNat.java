import java.io.File;

public class MyGetNat {
    public static void main(String[] args) {
        File dir = new File("C:\\Pics");
        if (!dir.exists()) {
            dir.mkdir();
        }

        for (int i = 0; i <= 10; i++) {
            String url = "http://www.space-fox.com/wallpapers/celebs/natalie-portman" +
                    "/natalie_portman_" + i + ".jpg";
            Thread t = new Thread(new MyGetNatThread(dir, url));
            t.start();
        }
    }
}
