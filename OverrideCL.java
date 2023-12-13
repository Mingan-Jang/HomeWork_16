import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideCL {

}

class Parent {
    // 父類別方法聲明拋出IOException
    void doSomething() throws IOException {
        // 具體實現
    }
}

class Child extends Parent {
    // 子類別複寫父類別方法，可以聲明IOException或其子類別的異常
    @Override
    void doSomething() throws FileNotFoundException {
        // 具體實現
    }
}
