import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyEnhancedCollection {

    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        // Set<String> data = new HashSet<String>();
        data.add("Hello");
        data.add("World");

        System.out.println("傳統for迴圈");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        System.out.println();

        System.out.println("使用iterator迴圈");
        for (Iterator it = data.iterator(); it.hasNext();) {
            System.out.println(it.next() + " ");
        }
        System.out.println();

        for (String str : data) {
            System.out.println(str);
        }

    }
}
