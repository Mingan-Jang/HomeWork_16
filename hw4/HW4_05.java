package hw4;

import java.util.Scanner;

public class HW4_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q5. 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
        // 例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

        int[] intDate = new int[3]; // intDate= [Year,month,date]

        int[] dayofMonth;
        boolean isLeapYear = false;

        do {
            System.out.println("Plz Input Year Month Date");
            for (int i = 0; i < intDate.length; i++) {
                intDate[i] = (int) sc.nextInt();
            }

            // 4整除且不能被100整除的年份是闰年，能被400整除的年份也是闰年
            if (intDate[0] % 400 == 0) {
                isLeapYear = true;
            } else if (intDate[0] % 4 == 0 && intDate[0] % 100 != 0) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }

            if (isLeapYear) {
                dayofMonth = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            } else {
                dayofMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            }

        } while (intDate[1] > 12 || intDate[2] > dayofMonth[intDate[1] - 1]);

        int daysToDate = 0;
        for (int i = 0; i < intDate[1] - 1; i++) {
            daysToDate += dayofMonth[i];
        }
        daysToDate += intDate[2];
        System.out.println(daysToDate);
        sc.close();
    }
}
