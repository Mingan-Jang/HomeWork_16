import java.io.*;

public class Test002 {
    public static void main(String[] args) {

        System.out.println("輸入資料");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            String data = br.readLine();
            int i1 = Integer.parseInt(data);
            System.out.println(i1 + 200);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
