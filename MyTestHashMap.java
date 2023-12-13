import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyTestHashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("one", 2f);
        map.put("two", "2");
        map.put("three", 3f);

        System.out.println(map.get("one"));
        // 1
        System.out.println(map.get("one").getClass());
        // class java.lang.Integer

        // keySet() 取出所有的key並包裝為Set
        // 方法來自Map介面
        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object myKey = it.next();
            System.out.println(myKey + "=" + map.get(myKey));
        }

        // Update the value
        map.put("three", 20f);

        // Removethe value
        map.remove("three");

        // isContain the value and the type mus be the same
        System.out.println(map.containsKey("three") ? "Key three" : "no key named three");
        System.out.println(map.containsValue(2f));

        // get value by key
        System.out.println("four=" + map.get("four"));
        System.out.println("one=" + map.get("one"));

        // Get all values
        // values會重複，所以回傳時指定型別為Collection
        Collection myValues = map.values();
        System.out.println("values=" + myValues);

    }
}
