package hw4;

public class HW4_02 {
    public static void main(String[] args) {
        // Q2. 請建立一個字串,經過程式執行後,輸入結果是反過來的
        String s = "HElloXWorld";
        char[] charsNewString = new char[s.length()];
        for (int a = 0; a < s.length() / 2 + 1; a++) {
            charsNewString[s.length() - a - 1] = s.charAt(a);
            charsNewString[a] = s.charAt(s.length() - a - 1);
        }
        String s2 = new String(charsNewString);
        System.out.println(s2);
    }
}
