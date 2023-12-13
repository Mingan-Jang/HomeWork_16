import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        Child2 c1 = new Child2();
        c1.doSomething();
    }
}

class Parent {
    void doSomething() throws IOException {

    }
}

class Child extends Parent {
    @Override
    void doSomething() throws FileNotFoundException {
        System.out.println("aaa");
    }
}

class Child2 extends Parent {

    @Override
    void doSomething() {
        System.out.println("Pppp");
    }
}