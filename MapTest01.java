import java.util.HashSet;

public class MapTest01 {
    public static void main(String[] args) {

        HashSet<String> hashset = new HashSet<String>();
        hashset.add("貧果");
        hashset.add("香蕉");
        hashset.add("葡萄");

        System.out.println(hashset);

        System.out.println(hashset.contains("貧果"));
        boolean A = hashset.remove("ji3ji3");
        System.out.println(A);
        A = hashset.remove("貧果");
        System.out.println(hashset.size());

    }
}
