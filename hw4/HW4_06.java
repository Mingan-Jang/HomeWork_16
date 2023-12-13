package hw4;

public class HW4_06 {
    public static void main(String[] args) {
        // Q6. 班上有8位同學,他們進行了6次考試結果如下:
        int[][] exam = {
                { 10, 35, 40, 100, 90, 85, 75, 70 },
                { 37, 75, 77, 89, 64, 75, 70, 95 },
                { 100, 70, 79, 90, 75, 70, 79, 90 },
                { 77, 95, 70, 89, 60, 75, 85, 89 },
                { 98, 70, 89, 90, 75, 90, 89, 90 },
                { 90, 80, 100, 75, 50, 20, 99, 75 },
        };

        int[][] person = new int[exam[1].length][2];
        for (int i = 0; i < exam[1].length; i++) {
            person[i][0] = i + 1;
        }

        int maxIndex;
        for (int i = 0; i < exam.length; i++) {
            maxIndex = 0;
            for (int j = 1; j < exam[i].length; j++) {
                if (exam[i][j] > exam[i][maxIndex]) {
                    maxIndex = j;
                }
            }
            person[maxIndex][1] += 1;
        }

        for (int i = 0; i < person.length; i++) {
            System.out.println("第" + person[i][0] + "號" + person[i][1] + "次最高分");
        }
    }

}