import java.io.FileInputStream;

class Book {
    // private static final long serialVersionUID = 8315449942815314809L;

    private String name;
    private double price; // 如果加上transient，該屬性不會加入序列化
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public void show() {
        System.out.println("書名: " + name);
        System.out.println("定價: " + price);
        System.out.println("作者: " + author);
    }
}

public class Test01 {
    public static void main(String[] args) {
        Book a1 = new Book("a", 9.11, "SDSD");
        a1.show();
        ;
    }
}
