import java.util.HashSet;
import java.util.Set;

public class RandomTest {
    public static void main(String[] args) {
        Set random6 = new HashSet<int[]>();
        while (random6.size() < 6) {
            random6.add((int) (Math.random() * 49 + 1));
        }
        System.out.println(random6);

    }
}
