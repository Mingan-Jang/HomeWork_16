public class TestCube {
    static private Cube s1;

    public static void main(String[] args) {
        try {
            s1 = new Cube(30);
        } catch (CubeException e) {
            System.out.println(e.getMessage());
        }
    }
}
