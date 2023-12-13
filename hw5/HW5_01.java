package hw5;

import java.util.Scanner;

public class HW5_01 {
    public static void main(String[] args) {
        // 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
        Scanner sc1 = new Scanner(System.in);
        System.out.println("請輸入寬高");
        int width = sc1.nextInt();
        int height = sc1.nextInt();
        starSquare(width, height);

    }

    public static void starSquare(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
