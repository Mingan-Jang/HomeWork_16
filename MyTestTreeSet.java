import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyTestTreeSet {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Integer(56));
        set.add(new Integer(34));
        set.add(new Integer(12));
        set.add(new Integer(12));
        set.add("AAAAA");

        Iterator objs = set.iterator();
        while (objs.hasNext()) {
            System.out.println(objs.next());
        }
    }
}
