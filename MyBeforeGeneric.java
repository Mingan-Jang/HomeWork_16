import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyBeforeGeneric {
    public static void main(String[] args) {
        List data = new ArrayList();
        data.add("Hello");
        data.add("World");

        // Why generic
        data.add(10);
        Iterator it = data.iterator();

        // Error Method

        // while (it.hasNext()) {
        // // 強制轉型
        // String str = (String) it.next();
        // System.out.println(str);
        // }

        // Generic Method
        while (it.hasNext()) {
            Object obj = it.next();
            if (obj instanceof Integer) {
                Integer i1 = (Integer) obj;
                System.out.println(i1.intValue());
            } else if (obj instanceof String) {
                String s2 = (String) obj;
                System.out.println(s2);
            }
        }

    }
}
