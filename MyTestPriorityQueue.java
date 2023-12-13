import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator<Type extends Comparable<Type>> implements Comparator<Type> {
    @Override
    public int compare(Type s1, Type s2) {
        return s1.compareTo(s2) * (-1);
    }
}

public class MyTestPriorityQueue {
    public static void main(String[] args) {

        // Method 2
        MyComparator<String> c = new MyComparator<String>();

        PriorityQueue<String> pq = new PriorityQueue<String>(3, c);
        pq.offer("c");
        pq.offer("a");
        pq.offer("b");
        String s;
        while ((s = pq.poll()) != null) {
            System.out.println(s + ", ");
        }
    }
}
