import java.math.BigDecimal;
import java.util.Arrays;

public class Test {
    private String brand;
    private double price;

    public static void main(String[] args) {
        System.out.println((int) (Math.random() * 3));

        var level = 88;
        var ss = switch (level) {
            case 88, 77 -> "A";
            case 5 -> 12;
            default -> {
                String AA = "EE";
                yield AA;
            }
        };
        System.out.println(ss);

        var op1 = new BigDecimal("0.1");
        var op2 = new BigDecimal("0.2");
        var op3 = new BigDecimal("0.3");
        if (op1.add(op2).equals(op3)) {
            System.out.println("TRUE");
        }

        int data1 = 10;
        int data2 = 300;

        var wrapper1 = Integer.valueOf(data1);
        var wrapper2 = Integer.valueOf(data2);

        System.out.println(wrapper1 / 3);
        System.out.println(wrapper2.compareTo(data2));
        System.out.println(wrapper2.doubleValue());

        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = 300;
        Integer i4 = 300;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        int[] scores = { 1, 2, 3 };
        for (int score : scores) {
            System.out.printf("學生分數 %d", score);
        }

        int[][] cords = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int i = 0; i < cords.length; i++) {
            for (int j = 0; j < cords[i].length; j++) {
                System.out.printf("%d", cords[i][j]);
            }
        }

        for (int[] row : cords) {
            for (int value : row) {
                System.out.println(value);
            }
        }

        var scores_r2 = new int[10];
        for (var score : scores_r2) {
            System.out.println(score);
        }

        Arrays.fill(scores_r2, 60);
        for (var score : scores_r2) {
            System.out.println(score);

        }

        int[] scores_r1 = { 99, 98, 48, 12 };

    }

    public Test(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Test(double price) {
        this("SKB", price);
    }

}