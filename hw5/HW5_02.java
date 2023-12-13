package hw5;

import java.util.HashSet;
import java.util.Set;

public class HW5_02 {
    // 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
    public static void main(String[] args) {

        int size = 10;

        Set<Integer> uniqueInts = new HashSet<>();
        while (uniqueInts.size() < size) {
            int randomNo = (int) (Math.random() * 101);
            uniqueInts.add(randomNo);
        }

        int index = 0;
        int[] intArr = new int[size];

        for (int number : uniqueInts) {
            // 遍歷集合、陣列等數據，集合集合集合
            intArr[index++] = number;
        }
        randAvg(intArr);

    }

    public static void randAvg(int[] intArr) {
        System.out.println("本次亂數結果");
        int sum = 0;
        double avg;
        for (int i = 0; i < intArr.length; i++) {
            System.out.printf("%d ", intArr[i]);
            sum += intArr[i];
        }
        avg = ((double) sum / intArr.length);
        System.out.printf("\n%.3f", avg);
    }
}
