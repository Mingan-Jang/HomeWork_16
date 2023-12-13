package Practice23;

import java.util.Scanner;
import static java.lang.System.out;

public class TestWeight {
    public static void main(String[] args) {
        InterfaceWeight[] objs = new InterfaceWeight[3];
        objs[0] = new Dog("Michael Jordan", 3.0f);
        objs[1] = new Plane("A30F", 3.0f);
        objs[2] = new Powder("Red", 3.0f);

        for (int i = 0; i < objs.length; i++) {
            objs[i].getWeightMethod();
        }

        out.println("aaa");

    }
}
