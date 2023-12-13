import java.util.LinkedHashSet;

public class MyTestLinkedHashSeet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");
        // 重複的元素不會被添加
        linkedHashSet.add("apple");

        // 遍歷元素，注意元素的順序
        System.out.println("LinkedHashSet Elements: " + linkedHashSet);

        // 檢查是否包含特定元素
        System.out.println("Contains Banana: " + linkedHashSet.contains("Banana"));

        // 刪除元素
        linkedHashSet.remove("Orange");

        // 遍歷修改後的元素
        System.out.println("LinkedHashSet Elements after removal: " + linkedHashSet);
    }
}
