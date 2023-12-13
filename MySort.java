import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MySort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);
        int[] a = { 1, 6, 2 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        List<String> stringList = new ArrayList<>();
        stringList.add("Orange");
        stringList.add("Apple");
        stringList.add("Banana");
        Collections.sort(stringList, Comparator.naturalOrder());

        String[] stringArray = { "Orange", "Apple", "Banana", "Cherry" };
        // 使用字母順序比較器
        Arrays.sort(stringArray, Comparator.naturalOrder());
        System.out.println(Arrays.toString(stringArray));
    }
}
