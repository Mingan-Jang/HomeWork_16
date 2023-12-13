package hw5;

public class HW5_04 {
    // 請設計一個類別MyRectangle:
    /**
     * InnerHW5_04
     */
    public static void main(String[] args) {
        MyRectangle rect1 = new MyRectangle();
        rect1.setDepth(20);
        rect1.setWidth(10);
        System.out.println(rect1.getArea());
        MyRectangle rect2 = new MyRectangle(10, 20);
        System.out.println(rect2.getArea());
    }

}
