
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fruit {
    public static void main(String[] args) {
        // 创建一个 HashMap 实例，键为水果名称，值为对应的库存数量
        Map fruitInventory = new HashMap();

        // 添加水果库存信息到 HashMap
        fruitInventory.put("Apple", 100);
        fruitInventory.put("Banana", 50);
        fruitInventory.put("Orange", 75);
        fruitInventory.put("Grapes", 120);

        // 使用 entrySet() 获取键值对的 Set 视图
        Set entrySet = fruitInventory.entrySet();

        // 遍历 entrySet 并访问水果的键值对
        for (Object entry : entrySet) {
            Map.Entry keyValue = (Map.Entry) entry;
            String fruitName = (String) keyValue.getKey();
            Integer stockQuantity = (Integer) keyValue.getValue();
            System.out.println("Fruit: " + fruitName + ", Stock Quantity: " + stockQuantity);
        }
    }
}
