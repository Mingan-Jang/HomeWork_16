package hw5;

public class HW5_03 {
    // 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double
    // x[][]),
    // 可以找出二維陣列的最大值並回傳,如圖:
    public static void main(String[] args) {
        int[][] intArray = {
                { 1, 6, 3 },
                { 9, 5, 2 }
        };

        double[][] doubleArray = {
                { 1.2, 3.5, 2.2 },
                { 7.4, 2.1, 8.2 }
        };

        System.out.println("兩個二維陣列的最大值回傳：");
        Work03 h3 = new Work03();
        System.out.println(h3.maxElement(intArray));
        System.out.println(h3.maxElement(doubleArray));

    }

}
