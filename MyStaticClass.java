public class MyStaticClass {
    static int staticVariable = 10;

    class InnerClass {
        static int InnerVariable = 20;
        // 非靜態內部類（Inner Class）是允許包含靜態成員的
    }

    public static void main(String[] args) {
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("InnerClass Variable: " + InnerClass.InnerVariable);

        staticInnerClass sc = new staticInnerClass();
        System.out.println("staticInnerClass Variable: " + sc.innerStaticVariable);

        // 靜態方法不能訪問靜態類別的 (非靜態變數)
        // System.out.println("Inner Static Variable: " +
        // staticInnerClass.innerStaticVariable);
    }

}

// 將該類別移出後，不用在寫static
class staticInnerClass {
    int innerStaticVariable = 30;
    // 靜態方法不能訪問靜態類別的 (非靜態變數)
}
