package hw5;

public class Work03 {
    public int maxElement(int[][] intArr) {
        int maxNo = Integer.MIN_VALUE;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                if (maxNo < intArr[i][j]) {
                    maxNo = intArr[i][j];
                }
            }
        }
        return maxNo;
    }

    public double maxElement(double[][] intArr) {
        double maxNo = Double.MIN_VALUE;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                if (maxNo < intArr[i][j]) {
                    maxNo = intArr[i][j];
                }
            }
        }
        return maxNo;
    }
}
