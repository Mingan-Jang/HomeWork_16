import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrrayListToSet {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.set(1, "orange");

        // 使用 toArray(T[] array) 将列表转换为指定类型的数组
        // 之後會說明泛型
        String[] stringArr = list.toArray(new String[0]);
        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(stringArr[i]);
        }

        // 如果有其他 類型，toArray出錯，因此宣告為Object
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(new Person("123", 220));
        list2.add(12);

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
            // ArrrayListToSet$Person@5acf9800
            // 12
        }

        // Shallow Copy
        // Method 1
        ArrayList<Object> listShallowClone0 = (ArrayList<Object>) list2.clone();

        // Method 2 using addAll
        ArrayList<Object> listShallowClone = new ArrayList<>();
        listShallowClone.addAll(list2);

        // Method 3 using constructor function
        ArrayList<Object> listShallowClone2 = new ArrayList<>(list2);

        ((Person) list2.get(0)).name = "abc";
        System.out.println("listShallowClone = " + ((Person) listShallowClone0.get(0)).name);
        System.out.println("listShallowClone = " + ((Person) listShallowClone.get(0)).name);
        System.out.println("listShallowClone2 = " + ((Person) listShallowClone2.get(0)).name);

        list2.set(1, 13);
        System.out.println("listShallowClone = " + listShallowClone0.get(1));
        System.out.println("listShallowClone = " + listShallowClone.get(1));
        System.out.println("listShallowClone2 = " + listShallowClone2.get(1));
    }

    // static context
    static class Person {
        public String name;
        public int age;

        public Person(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }
    }

}
