package hw6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) throws Exception {
        int x, y;
        boolean isValid = false;
        Calculator c1 = new Calculator();
        // 使用 try - with -resource 確保Scanner在發生Exception
        // 仍然能正常關閉(sc.close)
        // https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        try (Scanner sc = new Scanner(System.in);) {
            while (!isValid) {

                try {
                    System.out.println("Input x");
                    x = sc.nextInt();
                    System.out.println("Input y");
                    y = sc.nextInt();

                    System.out.println("等於 " + c1.powerXY(x, y));
                    isValid = true;
                } catch (CalException e) {
                    System.out.println(e.getMessage());
                } catch (RuntimeException e) {
                    sc.next(); // 消耗掉無效的輸入
                    System.out.println("輸入格式不正確");
                } finally {
                }
            }
        }

    }

}
