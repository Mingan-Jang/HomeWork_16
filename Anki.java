
public class Anki {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 5; i++) {
                // 模擬一些代碼，這裡我們假設 i=3 時發生異常
                if (i == 3) {
                    throw new RuntimeException("在 i=3 時發生異常");
                }
                System.out.println("迴圈執行 -> i=" + i);
            }
        } catch (RuntimeException e) {
            System.out.println("捕獲到異常：" + e.getMessage());
        } finally {
            // 無論如何，這個 finally 块中的代碼都會被執行
            System.out.println("Finally 執行，進行清理操作...");
        }
    }

}

class TestModifier {
    public void privateY() {
        // 在另一個方法中聲明區域變數
        private int y = 20;
        System.out.println("y 值為: " + y);
    }

    public void finalY() {
        // 在另一個方法中聲明區域變數
        final int y = 20;
        System.out.println("y 值為: " + y);
    }

}
