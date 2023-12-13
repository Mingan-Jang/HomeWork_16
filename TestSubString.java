public class TestSubString {
    public static void main(String[] args) {
        String s1 = "aaa/asdasd/aaaa";
        System.out.println(s1.substring(s1.lastIndexOf("/") + 1));
    }
}
