
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FruitHashMapExample {
    public static void main(String[] args) {
        Map fruitInventory = new HashMap();
        fruitInventory.put("Apple", 100);
        fruitInventory.put("Banana", 50);
        fruitInventory.put("Orange", 75);
        fruitInventory.put("Grapes", 120);

        Set entrySet = fruitInventory.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
