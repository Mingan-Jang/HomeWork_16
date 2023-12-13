import java.util.*;

public class MyTestStack {

    public static void main(String[] args) {
        Stack list = new Stack();
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("a");
        System.out.println(list.toString());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            // 因為Stack是屬於 List > Vector的成員
            // 所以也可使用get的方法存取
        }
        System.out.println("========");

        while (!list.isEmpty()) {
            // 不能寫Queue寫法，會拋出EmptyStackException
            // while ((o = list.pop()) != null) {
            System.out.println(list.pop());
        }

    }

}
