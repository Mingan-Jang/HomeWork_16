package hw5;

public class MyRectangle {
    private double width;
    private double depth;

    public MyRectangle() {
        super();
    }

    public MyRectangle(double width, double depth) {
        super();
        this.width = width;
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getArea() {
        return this.width * this.depth;
    }
}
