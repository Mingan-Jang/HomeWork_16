package hwExt.question_1;

public class InkBrush extends Pen {

    public InkBrush(String name, double price) {
        // InkBrush為定價9折
        super(name, price);
        this.discount = 0.9;
        this.setPrice(this.getPrice() * discount);
    }

    public void write() {
        System.out.println("沾墨汁再寫");
        System.out.printf("原價*%.2f\n", super.discount);
    }
}
