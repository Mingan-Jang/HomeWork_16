public class Cube {
    private double length;

    public Cube(double length) throws CubeException {
        setLength(length);
        System.out.println(this.getVolume());

    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) throws CubeException {
        this.length = length;
        if (length <= 0) {
            throw new CubeException("正方體邊常不得<=0");
        } else {
            this.length = length;
        }
    }

    public double getVolume() {
        return Math.pow(this.length, 3);
    }
}
