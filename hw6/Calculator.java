package hw6;

public class Calculator {
    public int powerXY(int x, int y) throws CalException {
        if (x == 0 || y == 0) {
            throw new CalException("x與y不能同時為0");
        } else if (y < 0) {
            throw new CalException("導致x的y次方結果不為整數");
        }
        return (int) Math.pow(x, y);
    }
}
