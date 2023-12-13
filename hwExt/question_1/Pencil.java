package hwExt.question_1;

public class Pencil extends Pen {
    public Pencil(String name, double price) {
        // Pencil實際售價為定價8折
        super(name, (double) price);
        this.discount = 0.8;
        this.setPrice(this.getPrice() * discount);
    }

    public void write() {
        System.out.println("削鉛筆再寫");
        System.out.printf("原價*%.2f\n", super.discount);

    }
}
