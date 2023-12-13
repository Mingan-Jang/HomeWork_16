package hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class HW4_04 {
    public static void main(String[] args) {
        // Q4. • 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
        int[][] employees = new int[][] { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount");
        int amount = sc.nextInt();
        ArrayList<Integer> persons = new ArrayList<Integer>();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i][1] >= amount) {
                persons.add(employees[i][0]);
            }
        }

        System.out.println("有錢借" + persons + persons.size() + "人");
        sc.close();
    }
}
