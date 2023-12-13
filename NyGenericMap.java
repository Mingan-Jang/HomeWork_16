import java.util.HashMap;
import java.util.Map;

public class NyGenericMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < 3; i++) {
            map.put(1, "number" + i);
        }
        System.out.println(map.get(12));
        System.out.println(map.get(2f));
        System.out.println(map.get(3L));
    }
}
