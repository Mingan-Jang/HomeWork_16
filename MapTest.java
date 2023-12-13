import java.util.HashSet;

public class MapTest {
    public static void main(String[] args) {
        // 創建一個 HashSet 實例
        HashSet<String> hashSet = new HashSet<>();

        // 添加元素到 HashSet
        hashSet.add("蘋果");
        hashSet.add("香蕉");
        hashSet.add("橙子");
        hashSet.add("葡萄");
        hashSet.add("蘋果"); // 重複元素，將被忽略

        // 打印 HashSet 內容
        System.out.println("HashSet 內容: " + hashSet);

        // 檢查 HashSet 是否包含某個元素
        System.out.println("HashSet 包含 '香蕉': " + hashSet.contains("香蕉"));

        // 刪除元素
        hashSet.remove("橙子");

        // 打印修改後的 HashSet 內容
        System.out.println("修改後的 HashSet 內容: " + hashSet);

        // 打印 HashSet 的大小
        System.out.println("HashSet 的大小: " + hashSet.size());

        // 清空 HashSet
        hashSet.clear();

        // 打印清空後的 HashSet 內容
        System.out.println("清空後的 HashSet 內容: " + hashSet);
    }
}
