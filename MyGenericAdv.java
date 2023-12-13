class BookClass<Type> {
    Type price;

    public static void show(BookClass<? extends Number> b) {
        System.out.println("Price ->" + b.price);
    }
}

public class MyGenericAdv {
    public static void main(String[] args) {
        BookClass<Integer> myBk = new BookClass<Integer>();
        myBk.price = 900;
        BookClass.show(myBk);

    }

}
