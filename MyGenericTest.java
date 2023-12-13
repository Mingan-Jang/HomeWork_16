import java.util.List;
import java.util.Vector;

class MyGeneric<Type> {
    private List<Type> list;

    public MyGeneric() {
        list = new Vector<Type>();
    }

    public void add(Type t) {
        list.add(t);
    }

    public Type get(int i) {
        return list.get(i);
    }
}

public class MyGenericTest {
    public static void main(String[] args) {
        MyGeneric<String> myGenericObject = new MyGeneric<String>();
        for (int i = 0; i < 3; i++) {
            myGenericObject.add("number" + i);
            System.out.println(myGenericObject.get(i));
        }

    }
}