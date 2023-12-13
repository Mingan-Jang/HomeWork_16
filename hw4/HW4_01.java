package hw4;

import java.util.ArrayList;

public class HW4_01 {
    public static void main(String[] args) {
        // Q1. 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
        int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
        int sum = 0;
        double average = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        average = ((double) sum / a.length);
        ArrayList<Integer> aboveAvgArr = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > average) {
                aboveAvgArr.add(a[i]);
            }
        }
        System.out.println(aboveAvgArr);

    }
}
