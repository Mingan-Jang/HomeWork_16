package hw1;

public class HW1 {
    public static void main(String[] args) {
        // Question 1
        // • 請設計一隻Java程式,計算12,6這兩個數值的和與積
        int a = 12;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println("==================");

        // Question 2
        // • 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
        int eggs = 200;
        int dozen = eggs / 12;
        int remainer = eggs % 12;
        System.out.println(dozen + "打");
        System.out.println(remainer + "顆");
        System.out.println("==================");

        // Question 3
        // • 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
        int totalsec = 256559;
        int days = totalsec / (24 * 60 * 60);
        int hrs = (totalsec % (24 * 60 * 60)) / (60 * 60);
        int mins = (totalsec % (24 * 60 * 60)) % (60 * 60) / 60;
        int seconds = (totalsec % (24 * 60 * 60)) % (60 * 60) % 60;

        System.out.println("Days: " + days);
        System.out.println("Hours: " + hrs);
        System.out.println("Minutes: " + mins);
        System.out.println("Seconds: " + seconds);
        System.out.println((days * (24 * 60 * 60) + hrs * (3600) + mins * 60 + seconds) == totalsec);
        System.out.println("==================");
        // Question 4
        // • 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
        final double PI = 3.1415;
        double radius = 5;
        double area = radius * radius * PI;
        double perimeter = 2 * radius * PI;
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
        System.out.println("==================");

        // Question 5
        // • 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
        // 金加利息共有多少錢 (用複利計算,公式請自行google)
        int deposit = 1_500_000;
        System.out.println(deposit * (Math.pow(1.02, 10)));
        System.out.println("==================");

        // Question 6
        // • 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
        System.out.println(5 + 5);
        // Expected Result : 10
        // int 5 加 int 5 結果為 int 10;
        System.out.println(5 + '5');
        // Expected result 58
        // int 5 加 char '5' ，char會回傳unicode的decimal值53;
        System.out.println(5 + "5");
        // Expected Result 55
        // int 5 加 String 5 ，最後會變成字串串接(concatencate)

        // 並請用註解各別說明答案的產生原因

    }
}
