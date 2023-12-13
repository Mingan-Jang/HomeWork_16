import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(12);
        list.add(34L);
        list.add(5.6);
        list.add("Hello");

        System.out.println(list);
        System.out.println(list.size());

    }
}
