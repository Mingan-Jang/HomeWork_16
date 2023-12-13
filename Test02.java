public class Test02 {
    public static void main(String[] args) {
        var aaa = "\uD834\uDD1E"; // 𝄞
        System.out.println(aaa);
        System.out.println(aaa.length());
        var bbb = "\u2601"; // ☁
        System.out.println(bbb);
        System.out.println(bbb.length());

        String s2 = "高音：";
        System.out.println(s2.length()); // 3
        System.out.println(s2.codePoints().count()); // 3

        String s1 = "高音：\uD834\uDD1E\u2601";
        System.out.println(s1); // 高音：𝄞☁
        System.out.println(s1.length()); // 6
        System.out.println(s1.codePoints().count()); // 5

    }
}
