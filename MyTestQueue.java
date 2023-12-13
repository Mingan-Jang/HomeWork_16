import java.util.LinkedList;
import java.util.Queue;

public class MyTestQueue {
    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.offer("First");
        q.offer("Second");
        q.offer("Third");
        Object o;
        System.out.println(q.toString());

        while ((o = q.poll()) != null) {
            String s = (String) o;
            System.out.println(s);
        }
        System.out.println(q.toString());
    }
}
