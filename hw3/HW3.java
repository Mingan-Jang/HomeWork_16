package hw3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HW3 {
    public static void main(String[] args) {
        // Q1. 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
        // 三角形、其它三角形或不是三角形,如圖示結果:
        Scanner sc = new Scanner(System.in);
        int[] intInput = new int[3];
        System.out.println("請輸入三個數字:");
        for (int i = 0; i < intInput.length; i++) {
            intInput[i] = (int) sc.nextInt();
        }
        String resultTri = checkTriangle(intInput);
        System.out.println(resultTri);

        // Q2. 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
        // 對則顯示正確訊息,如圖示結果:
        int guessNo = -1;
        int correctInt = (int) (Math.random() * 100);

        System.out.println("開始猜數字 (0~100)");
        guessNo = sc.nextInt();
        while (guessNo != correctInt) {
            if (guessNo > correctInt) {
                System.out.println("猜錯了 大於正確答案");
            } else {
                System.out.println("猜錯了 小於正確答案");
            }
            guessNo = sc.nextInt();
        }
        System.out.println("猜對了 數字為" + guessNo);

        // Q3.阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
        // 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
        // 的號碼與總數,如圖:
        int unlikeNo;

        do {
            System.out.println("請輸入你討厭的數字 (1~9)");
            while (!sc.hasNextInt()) {
                System.out.println("Not a number please input again");
                sc.next(); // 消耗無效的輸入
            }
            unlikeNo = sc.nextInt();
        } while (1 > unlikeNo || unlikeNo > 9);

        int count = 0;
        ArrayList<Integer> intIwillWin = new ArrayList<Integer>();
        for (int i = 0; i < 49; i++) {
            if (i % 10 != unlikeNo && i / 10 != unlikeNo) {
                count++;
                intIwillWin.add(i);
                if (count % 6 == 0) {
                    System.out.print(i + "\t\n");
                } else {
                    System.out.print(i + "\t");
                }
            }
        }
        System.out.println("共有" + count + "數字");
        int[] intUniqueSix = getUniqueIntergerArray(6, 1, count);
        for (int y = 0; y < intUniqueSix.length; y++) {
            System.out.print(intIwillWin.get(intUniqueSix[y]) + "\t");
        }
        // Final
        sc.close(); // 此處關閉 Scanner

    }

    static public int[] getUniqueIntergerArray(int count, int min, int max) {
        Set<Integer> uniqueInts = new HashSet<>();
        int[] intArr = new int[count];
        if (count > (max - min + 1) || max < min) {
            System.out.println("無法生成不重複數字");
            return intArr;
        }

        while (uniqueInts.size() < count) {
            int randomNo = (int) (Math.random() * (max - min + 1) + min);
            uniqueInts.add(randomNo);
        }

        // 將Set轉換為整數陣列
        int[] result = new int[count];
        int index = 0;
        for (int number : uniqueInts) {
            // 遍歷集合、陣列等數據，集合集合集合
            result[index++] = number;
        }
        return result;

    }

    static public String checkTriangle(int[] vectors) {
        // Bubble Sort
        int temp = 0;
        for (int j = 0; j < vectors.length - 1; j++) {
            for (int i = 0; i < vectors.length - 1 - j; i++) {
                if (vectors[i] > vectors[i + 1]) {
                    temp = vectors[i];
                    vectors[i] = vectors[i + 1];
                    vectors[i + 1] = temp;
                }
            }
        }
        if (vectors[0] <= 0 || vectors[2] >= (vectors[1] + vectors[0])) {
            return "不是三角形";
        }

        if (Math.pow(vectors[0], 2) + Math.pow(vectors[1], 2) == Math.pow(vectors[2], 2))
            return "直角三角形";

        if (vectors[1] == vectors[0] || vectors[1] == vectors[2]) {
            if (vectors[0] == vectors[2]) {
                return "正三角形";
            } else {
                return "等腰三角形";
            }
        }

        return "其他三角形";
    }

}
