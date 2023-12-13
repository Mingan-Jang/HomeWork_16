import java.util.HashMap;
import java.util.Map;

public class TestTreeMao {
    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<Integer, String>();
        // Map<Integer, String> map = new TreeMap<Integer, String>(); //
        // TreeMap的Key要同一型別
        for (int i = 0; i < 6; i++) {
            myMap.put(i, "David" + i);
        }

        for (String val : myMap.values()) {
            System.out.println(val);
        }

    }
}
