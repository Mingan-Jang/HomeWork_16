import java.io.*;

public class Hello {
    public static void main(String[] args) {
        // 假設有一個 InputStream 對象，例如 System.in（標準輸入）
        InputStream inputStream = System.in;

        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream)) {
            System.out.println("請輸入文字，按下 Enter 鍵結束：");

            int data;
            while ((data = inputStreamReader.read()) != -1) {
                char character = (char) data;
                System.out.print(character);

                // 如果輸入是換行符，結束循環
                if (character == '\n') {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
