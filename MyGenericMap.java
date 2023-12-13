import java.util.HashMap;
import java.util.Map;

public class MyGenericMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < 3; i++) {
            map.put(i, "number" + i);
        }
        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));

    }

}
