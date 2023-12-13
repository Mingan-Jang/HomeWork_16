import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyTestHashSet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        set.add(12);
        set.add(34L);
        set.add("Hello");
        // 透過String.equals檢查是否相等
        // 相等則加入失敗
        set.add("Hello");

        System.out.println("toString=" + set);
        System.out.println("元素個數=" + set.size());

        Iterator objs = set.iterator();
        while (objs.hasNext()) {
            System.out.println(objs.next());
            // 34
            // Hello
            // 12
        }
        for (Object obj : set) {
            System.out.println(obj.getClass());
            // 自動裝箱
            // class java.lang.Long
            // class java.lang.String
            // class java.lang.Integer
        }

        System.out.println(set.remove("Hello") ? "Remove" : "No Removed");
        // 自動裝箱
        System.out.println(set.remove(12) ? "Removed" : "No Removed");
        System.out.println(set.contains(12) ? "12 is Removed" : "12 is not Removed");

        // Wrong 1，Long無法直接轉成String
        String[] newStrings = set.toArray(new String[set.size()]);
        System.out.println("New Arrays=" + newStrings);

        // Solution 1，Long >> Object >> toString()
        Object[] newObjs = set.toArray(new Object[set.size()]);
        String[] toStringResults = new String[newObjs.length];

        for (int i = 0; i < newObjs.length; i++) {
            toStringResults[i] = newObjs[i].toString();
            System.out.println(toStringResults[i]);
        }

    }

}
