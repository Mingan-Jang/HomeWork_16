import java.util.ArrayList;
import java.util.List;

public class TestEnhancedAttention {
    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        data.add("David1");
        data.add("David2");
        data.add("David3");

        for (int i = data.size() - 1; i >= 0; i--) {
            System.out.println(i + ":" + data.get(i));
        }
        System.out.println();

        for (String str : data) {
            System.out.println(str);
        }
    }
}
