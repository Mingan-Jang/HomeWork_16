package hw2;

import java.util.ArrayList;

public class HW2 {
    public static void main(String[] args) {
        // Questuion 1
        // • 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
        int sum = 0;
        for (int i = 2; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("=================");

        // Questuion 2
        // • 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
        int multiply_for = 1;
        for (int i = 1; i <= 10; i++) {
            multiply_for *= i;
        }
        System.out.println(multiply_for);
        System.out.println("=================");

        // Questuion 3
        // • 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
        int multiply_while = 1;
        int count = 1;
        while (count <= 10) {
            multiply_while *= count;
            count++;
        }
        System.out.println(multiply_while);
        System.out.println("=================");

        // Questuion 4
        // • 請設計一隻Java程式,輸出結果為以下:
        // 1 4 9 16 25 36 49 64 81 100
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * i);
        }
        System.out.println("=================");

        // Questuion 5
        // 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
        // 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

        // Method 2
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        for (int i = 1; i <= 49; i++) {
            if (!(i % 10 == 4 || i / 10 == 4)) {
                nums2.add(i);
            }
        }
        System.out.println("有" + nums2.size() + "個數字");
        System.out.println(nums2);

        System.out.println("=================");

        // Questuion 6
        // 請設計一隻Java程式,輸出結果為以下:
        for (int i = 10; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.printf("%n");

            // Windows \r\n
            // Unix、Linux、MacOS \n
            // classic Mac OS \r
        }
        System.out.println("=================");

        // Questuion 7
        // • 請設計一隻Java程式,輸出結果為以下:
        int a = 'A';

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) a);
            }
            a++;
            System.out.printf("%n");
        }
        System.out.println("=================");

        // Exercise 1
        // 使用for迴圈 + do while迴圈
        int x = 1, y = 1;
        for (x = 1; x < 10; x++) {

            y = 1;
            do {
                System.out.print(x + "*" + y + "=" + x * y + '\t');
                y++;
            } while (y < 10);
            System.out.printf("%n");

        }
        System.out.println("=================");

        // Exercise 2
        // 使用while迴圈 + do while迴圈
        int i = 1, j;
        while (i < 10) {
            j = 1;
            do {
                System.out.print(i + "*" + j + "=" + i * j + '\t');
                j++;
            } while (j < 10);
            System.out.printf("%n");
            i++;
        }
    }
}
