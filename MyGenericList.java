import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyGenericList {
    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        data.add("Hello");
        data.add("World");

        Iterator<String> it = data.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
