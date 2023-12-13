package hwExt.question_1;

public class TestPen {
    public static void main(String[] args) {
        Pen[] myPens = new Pen[2];
        myPens[0] = new Pencil("Pencil", 200);
        myPens[1] = new InkBrush("InkBrush", 190);
        for (int i = 0; i < myPens.length; i++) {
            System.out.println(myPens[i].getBrand());
            myPens[i].write();
            System.out.println(myPens[i].getPrice());

        }
    }
}
