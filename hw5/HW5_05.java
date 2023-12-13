package hw5;

public class HW5_05 {

    public static void main(String[] args) {
        String randomString = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";// 儲存數字0-9 和 大小寫字母

        int textLength = 8;
        char[] textRandom = new char[textLength];
        for (int i = 0; i < textLength; i++) {
            textRandom[i] = randomString.charAt((int) (Math.random() * 62));
        }

        System.out.println(textRandom);
    }

}
