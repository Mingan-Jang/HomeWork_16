import java.util.Iterator;

class MyIterable implements Iterable<Integer> {
    private int[] data;

    public MyIterable(int[] data) {
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

}

public class IteratorTest2 {

}
